package com.synisys.trainings.Interpreter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInterpreter {
	Client example;
	
	@Before
	public void setter(){
		example = new Client(new Context());
	}
	
	@Test
	public void check(){
		Assert.assertEquals("100 in binary is 1100100",
				(example.interpret("100 in Binary")), "1100100");
		
		Assert.assertEquals("100 in octal is 144",
				(example.interpret("100 in Octal")), "144");
		
		Assert.assertEquals("100 in binary is 64",
				(example.interpret("100 in Hexadecimal")), "64");

	}

}
