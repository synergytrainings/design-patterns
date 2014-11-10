package com.synisys.training.patterns.singleton;

import com.synisys.training.patterns.singleton.abstractfactory.DAOFactory;
import com.synisys.training.patterns.singleton.abstractfactory.implementation.XmlUserDAO;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class TestSingleton {

	public static final String SERIALIZATION_FILE = "test";

	/**
	 * Tests singleton implementation in {@link SerializableApplicationConfigurations} serializable class.
	 * Tests that de-serialization don't create new instance.
	 */
	@Test
	public void testDeserialization() throws IOException, ClassNotFoundException {
		SerializableApplicationConfigurations initialInstance = SerializableApplicationConfigurations.getInstance();


		try (FileOutputStream outputStream = new FileOutputStream(SERIALIZATION_FILE);
		     FileInputStream inputStream = new FileInputStream(SERIALIZATION_FILE);
		     ObjectOutput out = new ObjectOutputStream(outputStream);
		     ObjectInput in = new ObjectInputStream(inputStream)) {

			// Serialize to a file
			out.writeObject(initialInstance);

			//De-serialize from file
			SerializableApplicationConfigurations deserializedInstance = (SerializableApplicationConfigurations) in.readObject();

			//checks that de-serialization don't create new instance.
			assertEquals(initialInstance, deserializedInstance);

		}

	}

	/**
	 * Tests {@link ApplicationConfigurations} implementation.
	 * <br/>
	 * Checks that it isn't possible create new instance by reflection. InvocationTargetException must be thrown.
	 */
	@Test(expected = InvocationTargetException.class)
	public void testInnerClassImplementation() throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {

		Constructor<ApplicationConfigurations> constructor = ApplicationConfigurations.class.getDeclaredConstructor();
		constructor.setAccessible(true);

		//exception must be thrown after this code.
		ApplicationConfigurations instanceByReflection = constructor.newInstance();
		fail("InvocationTargetException had to thrown.");

	}

	@Test
	public void testDaoFactory() {
		System.setProperty(DAOFactory.PERSISTENCE_TYPE_SYSTEM_PROPERTY, "XML");
		DAOFactory daoFactory = DAOFactory.getInstance();
		assertEquals("UserDAO must be XmlUserDAO!", XmlUserDAO.class, daoFactory.getUserDAO().getClass());
	}

}
