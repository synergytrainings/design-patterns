package design.patterns.interpreter;

import java.util.Stack;

public class Expression implements IExpression{

    private String expressionStr;
    
    public Expression(String expressionStr) {
    	this.expressionStr = expressionStr;
    }
    	
	@Override
	public double getValue(Context context) {
		Stack<IExpression> stack1 = new Stack<>();
		Stack<IExpression> stack = new Stack<>();
		String[] tokenList = expressionStr.split(" ");
		for (String s : tokenList){
			if (!s.equals("+") && !s.equals("-"))
			stack1.push(new BasicNumber(s));
		}
		while (!stack1.isEmpty()) {
			stack.push(stack1.pop());
			
		}
		
		for (String s : tokenList) {
			if (s.equals("+")) {
				IExpression number1 = stack.pop();
				IExpression number2 = stack.pop();
				IExpression exp = new AddExpression(number1, number2);
				double value = exp.getValue(context);
				stack.push(new BasicNumber(value));
			} else if (s.equals("-")) {
				IExpression number1 = stack.pop();
				IExpression number2 = stack.pop();
				IExpression exp = new MinusExpression(number1, number2);
				double value = exp.getValue(context);
				stack.push(new BasicNumber(value));
			}
		}
		return stack.pop().getValue(context);
		
	}

}
