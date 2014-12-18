package com.synisys.trainings.Interpreter;

public class Demo {

	public static void main(String args[]) {
		String binary = "100 in Binary";
		String octal = "100 in Octal";
		String hex = "100 in Hexadecimal";

		Client example = new Client(new Context());
		System.out.println(binary + " = " + example.interpret(binary));
		System.out.println(octal + " = " + example.interpret(octal));
		System.out.println(hex + " = " + example.interpret(hex));
	}
}
