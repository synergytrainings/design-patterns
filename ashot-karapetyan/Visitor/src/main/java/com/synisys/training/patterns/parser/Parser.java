package com.synisys.training.patterns.parser;

import java.util.LinkedList;

/**
 * A parser for mathematical expressions. The parser class defines a method
 * parse() which takes a string and returns an ExpressionNode that holds a
 * representation of the expression.
 * <p/>
 * Parsing is implemented in the form of a recursive descent parser.
 */
public class Parser {
	/**
	 * the tokens to parse
	 */
	LinkedList<Token> tokens;
	/**
	 * the next token
	 */
	Token lookahead;

	/**
	 * Parse a mathematical expression in a string and return an ExpressionNode.
	 * <p/>
	 * This is a convenience method that first converts the string into a linked
	 * list of tokens using the expression tokenizer provided by the Tokenizer
	 * class.
	 *
	 * @param expression the string holding the input
	 * @return the internal representation of the expression in form of an
	 * expression tree made out of ExpressionNode objects
	 */
	public ExpressionNode parse(String expression) {
		Tokenizer tokenizer = Tokenizer.getExpressionTokenizer();
		tokenizer.tokenize(expression);
		LinkedList<Token> tokens = tokenizer.getTokens();
		return this.parse(tokens);
	}

	/**
	 * Parse a mathematical expression in contained in a list of tokens and return
	 * an ExpressionNode.
	 *
	 * @param tokens a list of tokens holding the tokenized input
	 * @return the internal representation of the expression in form of an
	 * expression tree made out of ExpressionNode objects
	 */
	public ExpressionNode parse(LinkedList<Token> tokens) {
		// implementing a recursive descent parser
		this.tokens = (LinkedList<Token>) tokens.clone();
		lookahead = this.tokens.getFirst();

		// top level non-terminal is expression
		ExpressionNode expr = expression();

		if (lookahead.token != Token.EPSILON)
			throw new ParserException("Unexpected symbol %s found", lookahead);

		return expr;
	}

	/**
	 * handles the non-terminal expression
	 */
	private ExpressionNode expression() {
		// only one rule
		// expression -> signed_term sum_op
		ExpressionNode expr = signedTerm();
		expr = sumOp(expr);
		return expr;
	}

	/**
	 * handles the non-terminal sum_op
	 */
	private ExpressionNode sumOp(ExpressionNode expr) {
		// sum_op -> PLUSMINUS term sum_op
		if (lookahead.token == Token.PLUSMINUS) {
			AdditionExpressionNode sum;
			// This means we are actually dealing with a sum
			// If expr is not already a sum, we have to create one
			if (expr.getType() == ExpressionNode.ADDITION_NODE)
				sum = (AdditionExpressionNode) expr;
			else
				sum = new AdditionExpressionNode(expr, true);

			// reduce the input and recursively call sum_op
			boolean positive = lookahead.sequence.equals("+");
			nextToken();
			ExpressionNode t = term();
			sum.add(t, positive);

			return sumOp(sum);
		}

		// sum_op -> EPSILON
		return expr;
	}

	/**
	 * handles the non-terminal signed_term
	 */
	private ExpressionNode signedTerm() {
		// signed_term -> PLUSMINUS term
		if (lookahead.token == Token.PLUSMINUS) {
			boolean positive = lookahead.sequence.equals("+");
			nextToken();
			ExpressionNode t = term();
			if (positive)
				return t;
			else
				return new AdditionExpressionNode(t, false);
		}

		// signed_term -> term
		return term();
	}

	/**
	 * handles the non-terminal term
	 */
	private ExpressionNode term() {
		// term -> factor term_op
		ExpressionNode f = factor();
		return termOp(f);
	}

	/**
	 * handles the non-terminal term_op
	 */
	private ExpressionNode termOp(ExpressionNode expression) {
		// term_op -> MULTDIV factor term_op
		if (lookahead.token == Token.MULTDIV) {
			MultiplicationExpressionNode prod;

			// This means we are actually dealing with a product
			// If expr is not already a PRODUCT, we have to create one
			if (expression.getType() == ExpressionNode.MULTIPLICATION_NODE)
				prod = (MultiplicationExpressionNode) expression;
			else
				prod = new MultiplicationExpressionNode(expression, true);

			// reduce the input and recursively call sum_op
			boolean positive = lookahead.sequence.equals("*");
			nextToken();
			ExpressionNode f = signedFactor();
			prod.add(f, positive);

			return termOp(prod);
		}

		// term_op -> EPSILON
		return expression;
	}

	/**
	 * handles the non-terminal signed_factor
	 */
	private ExpressionNode signedFactor() {
		// signed_factor -> PLUSMINUS factor
		if (lookahead.token == Token.PLUSMINUS) {
			boolean positive = lookahead.sequence.equals("+");
			nextToken();
			ExpressionNode t = factor();
			if (positive)
				return t;
			else
				return new AdditionExpressionNode(t, false);
		}

		// signed_factor -> factor
		return factor();
	}

	/**
	 * handles the non-terminal factor
	 */
	private ExpressionNode factor() {
		// factor -> argument factor_op
		ExpressionNode a = argument();
		return factorOp(a);
	}


	/**
	 * handles the non-terminal factor_op
	 */
	private ExpressionNode factorOp(ExpressionNode expr) {
		// factor_op -> RAISED expression
		if (lookahead.token == Token.RAISED) {
			nextToken();
			ExpressionNode exponent = signedFactor();

			return new ExponentiationExpressionNode(expr, exponent);
		}

		// factor_op -> EPSILON
		return expr;
	}

	/**
	 * handles the non-terminal argument
	 */
	private ExpressionNode argument() {
		// argument -> FUNCTION argument
		if (lookahead.token == Token.FUNCTION) {
			int function = FunctionExpressionNode.stringToFunction(lookahead.sequence);
			nextToken();
			ExpressionNode expr = argument();
			return new FunctionExpressionNode(function, expr);
		}
		// argument -> OPEN_BRACKET sum CLOSE_BRACKET
		else if (lookahead.token == Token.OPEN_BRACKET) {
			nextToken();
			ExpressionNode expr = expression();
			if (lookahead.token != Token.CLOSE_BRACKET)
				throw new ParserException("Closing brackets expected", lookahead);
			nextToken();
			return expr;
		}

		// argument -> value
		return value();
	}

	/**
	 * handles the non-terminal value
	 */
	private ExpressionNode value() {
		// argument -> NUMBER
		if (lookahead.token == Token.NUMBER) {
			ExpressionNode expr = new ConstantExpressionNode(lookahead.sequence);
			nextToken();
			return expr;
		}

		// argument -> VARIABLE
		if (lookahead.token == Token.VARIABLE) {
			ExpressionNode expr = new VariableExpressionNode(lookahead.sequence);
			nextToken();
			return expr;
		}

		if (lookahead.token == Token.EPSILON)
			throw new ParserException("Unexpected end of input");
		else
			throw new ParserException("Unexpected symbol %s found", lookahead);
	}

	/**
	 * Remove the first token from the list and store the next token in lookahead
	 */
	private void nextToken() {
		tokens.pop();
		// at the end of input we return an epsilon token
		if (tokens.isEmpty())
			lookahead = new Token(Token.EPSILON, "", -1);
		else
			lookahead = tokens.getFirst();
	}
}
