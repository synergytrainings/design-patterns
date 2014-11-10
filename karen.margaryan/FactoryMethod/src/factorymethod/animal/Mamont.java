package factorymethod.animal;

public class Mamont implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Make Mamont Voice");

	}

	@Override
	public int getLegsCount() {
		return 4;
	}

}
