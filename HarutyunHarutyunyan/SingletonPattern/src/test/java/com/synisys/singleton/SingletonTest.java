package com.synisys.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Assert;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void testGetInstance() throws Exception{
		Assert.assertTrue("Is the two instances the same", Singleton.getInstance() == Singleton.getInstance());
	}
	
	@Test
	public void serializedTest() throws Exception  {
		Singleton instanceOne = Singleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
				"filename.ser"));
		out.writeObject(instanceOne);
		out.close();

		// deserailize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream(
				"filename.ser"));
		Singleton instanceTwo = (Singleton) in.readObject();
		in.close();
        Assert.assertTrue("Is instance hashCode equale" , instanceOne.hashCode() == instanceTwo.hashCode());
	}
	
	

}
