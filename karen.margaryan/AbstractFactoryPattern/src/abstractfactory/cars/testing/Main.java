package abstractfactory.cars.testing;

import abstractfactory.os.AbstractFactory;
import abstractfactory.os.OperationSystem;
import abstractfactory.os.OperationSystemFactory;
import abstractfactory.os.OperationSystemType;
import abstractfactory.os.linux.LinuxType;
import abstractfactory.os.windows.WindowsType;


/**
 * Demonstrates Abstract Factory Pattern in real life
 * @author Karen Margaryan
 *
 */
public class Main {

	public static void main(String[] args) {
		// Initialize abstract factory
		AbstractFactory abstractFactory = new AbstractFactory();
		
		// Create Linux OS factory method and using it run a specific type of linux OS
		OperationSystemFactory factory = abstractFactory.getOSFactory(OperationSystemType.LINUX);
		OperationSystem os = factory.createOperationSystem(LinuxType.REDHAT);
		os.runTerminal();
		os.runOffice();
		
		System.out.println("---------------------------------------");
		
		// Create Linux OS factory method and using it run a specific type of linux OS
		factory = abstractFactory.getOSFactory(OperationSystemType.LINUX);
		os = factory.createOperationSystem(LinuxType.UBUNTU);
		os.runTerminal();
		os.runOffice();
		
		System.out.println("---------------------------------------");

		// Create Windows OS factory method and using it run a specific type of linux OS
		factory = abstractFactory.getOSFactory(OperationSystemType.WINDOWS);
		os = factory.createOperationSystem(WindowsType.WINDOWS_SERVER);
		os.runTerminal();
		os.runOffice();
		
	}

}
