package training.pattern.builder.demo;

import main.java.training.pattern.builder.impl.Address;

/**
 * Simple class for demonstration use of builder pattern in practice
 * @author LilitsComp
 *
 */
public class BuilderPatternDemo {

	public static void main(String[] args) {
		Address address1 = new Address.Builder("Armenia").city("Yerevan").street("Abovyan str").building(23).appartment(12).build();
		Address address2 = new Address.Builder("USA").town("Montana").home(123).build();
		System.out.print(address1);
		System.out.print("---------------------------\n");
		System.out.print(address2);
	
	}

}
