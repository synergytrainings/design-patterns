package main.com.synisys.trainings.designPatterns;

import java.util.ArrayList;
import java.util.Iterator;

import main.com.synisys.trainings.designPatterns.expressions.HundredExpression;
import main.com.synisys.trainings.designPatterns.expressions.OneExpression;
import main.com.synisys.trainings.designPatterns.expressions.TenExpression;
import main.com.synisys.trainings.designPatterns.expressions.ThousandExpression;

public class Demo {
	public static void main(String[] args) {
		int number = 4099;
		Context context = new Context(number); 
		// Build the 'parse tree'
		ArrayList<Expression> tree = new ArrayList<>();
		tree.add(new OneExpression());
		tree.add(new TenExpression());
		tree.add(new HundredExpression());
		tree.add(new ThousandExpression());		
		
		//Interpret 
		for (Iterator<Expression> it = tree.iterator(); it.hasNext();) { 
			Expression exp = (Expression)it.next();
			exp.interpret(context); 
		}
		
		System.out.println(number + " = " + context.getOutput());
		
		// Result is: 4099 = chors hazar insunin@
	}
}
