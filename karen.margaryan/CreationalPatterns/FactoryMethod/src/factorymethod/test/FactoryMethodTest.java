package factorymethod.test;

import static org.junit.Assert.*;

import org.junit.Test;

import factorymethod.animal.Animal;
import factorymethod.animal.AnimalType;
import factorymethod.animal.Bear;
import factorymethod.animal.Mamont;
import factorymethod.factory.AnimalDeliveringMagicSystem;

public class FactoryMethodTest {

	private AnimalDeliveringMagicSystem deliverySystem = new AnimalDeliveringMagicSystem();
	
	@Test
	public void testCreatedClassType() {
		// Checks whether the factory method creates a correct type of class
		Animal animal = deliverySystem.deliverAnimal(AnimalType.BEAR);
		assertEquals("Factory method should create class with a type of <Bear>", 
				animal.getClass(), Bear.class);
		
		animal = deliverySystem.deliverAnimal(AnimalType.MAMONT);
		assertEquals("Factory method should create class with a type of <Mamont>", 
				animal.getClass(), Mamont.class);
	}
	
	@Test
	public void testCreatedClassGetterMethod() {
		// Assume we read the animal type from command line
		AnimalType animalType = AnimalType.MAMONT;
		
		// Check whether the created class is appropriate type and 
		// the classed method is the correct one
		Animal animal = deliverySystem.deliverAnimal(animalType);
		if (animalType == AnimalType.MAMONT) {
			assertEquals("Mamont has 4 legs", 4, animal.getLegsCount());
		} else {
			assertEquals("Bear has 4 legs", 2, animal.getLegsCount());
		}
		
	}
	
	

}
