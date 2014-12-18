package main.com.synisys.trainings.designPatterns;

import java.security.InvalidParameterException;

public abstract class Expression {
	public void interpret(Context context) {
		if (context.getInput() > 0) {
			int x = context.getInput() % 10;
			switch (x) {
			case 0:
				context.addOutput(zero());				
				break;
			case 1:
				context.addOutput(one());				
				break;
			case 2:
				context.addOutput(two());				
				break;								
			case 3:
				context.addOutput(three());				
				break;				
			case 4:
				context.addOutput(four());				
				break;
			case 5:
				context.addOutput(five());				
				break;
			case 6:
				context.addOutput(six());				
				break;
			case 7:
				context.addOutput(seven());				
				break;
			case 8:
				context.addOutput(eight());				
				break;
			case 9:
				context.addOutput(nine());				
				break;
			default: throw new InvalidParameterException(); // unreachable case!!!
			}
			context.setInput(context.getInput() / 10);
		}				
	}
	
	public String zero() {	
		return "";
	}
	
	public abstract String one();
	public abstract String two();
	public abstract String three();
	public abstract String four();
	public abstract String five();
	public abstract String six();
	public abstract String seven();
	public abstract String eight();
	public abstract String nine();
}
