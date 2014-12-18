package com.synisys.trainings.Interpreter;

public class Context {

	public String getNumberInBinary(int number) {
		return Integer.toBinaryString(number);
	}

	public String getNumberInHexadecimal(int number) {
		return Integer.toHexString(number);
	}
	
	public String getNumberInOctal(int number) {
		return Integer.toOctalString(number);
	}
	
}
