package com.synisys.trainings.Interpreter;

public class Client {

	public Context context;

	public Client(Context context) {
		this.context = context;
	}

	public String interpret(String str) {
		
		Expression expression = null;
		if(str.contains("Binary")){
			expression = new BinaryExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
		}
		else{
			if (str.contains("Octal")) {
				expression = new OctalExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
			}
			else{
				if (str.contains("Hexadecimal")) {
					expression = new HexadecimalExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
				} else
					return str;
			}
		}
		return expression.interpret(context);
	}
}
