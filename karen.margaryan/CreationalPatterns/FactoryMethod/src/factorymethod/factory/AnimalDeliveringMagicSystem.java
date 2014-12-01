package factorymethod.factory;

import factorymethod.animal.Animal;
import factorymethod.animal.AnimalType;
import factorymethod.animal.Bear;
import factorymethod.animal.Mamont;

/**
 * This ia a magic equipment which delivers different kind of animals
 * @author Karen
 *
 */
public class AnimalDeliveringMagicSystem implements AnimalDerliverySystem {
	
	/**
	 * Magic method producing animals
	 * @param animalType an animal type to be created
	 * @return appropriate type of animal object
	 */
	@Override
	public Animal deliverAnimal(AnimalType animalType) {
		Animal animal = null;
		switch (animalType) {
		case MAMONT:
			animal = new Mamont();
			break;
			
		case BEAR:
			animal = new Bear();
			break;
		}

		return animal;
	}
}
