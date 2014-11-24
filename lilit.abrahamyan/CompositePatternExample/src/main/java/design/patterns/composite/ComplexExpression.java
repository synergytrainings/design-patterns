package design.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author lilit.abrahamyan
 * 
 */
public class ComplexExpression implements Expression {

	private List<Expression> primitiveExpressions = new ArrayList<>();
	
	@Override
	public int calculate() {
		int total = 0;
		for (Expression e : primitiveExpressions) {
			total += e.calculate();
		}
		return total;
	}
	
	public void addExpression(Expression e){
		this.primitiveExpressions.add(e);
	}
	
	public void removeExpression(Expression e){
		this.primitiveExpressions.remove(e);
	}

}
