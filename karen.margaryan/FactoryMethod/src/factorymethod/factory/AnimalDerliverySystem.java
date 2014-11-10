package factorymethod.factory;

import factorymethod.animal.Animal;
import factorymethod.animal.AnimalType;

public interface AnimalDerliverySystem {

	public Animal deliverAnimal(AnimalType animalType);
	
}
