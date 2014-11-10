package factorymethod.animal;

public class Bear implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Make Bear Voice");

	}

	@Override
	public int getLegsCount() {
		return 2;
	}

}
