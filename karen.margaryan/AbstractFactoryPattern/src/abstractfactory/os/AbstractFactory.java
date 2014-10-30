package abstractfactory.os;

import abstractfactory.os.linux.LinuxFactory;
import abstractfactory.os.windows.WindowsFactory;

/**
 * Abstract Factory class creating a factory methods which will be used to
 * create and run an operation systems
 * 
 * @author Karen Margaryan
 * 
 */
public class AbstractFactory {

	public OperationSystemFactory getOSFactory(
			OperationSystemType operationSystem) {

		switch (operationSystem) {
		case LINUX:
			return new LinuxFactory();

		case WINDOWS:
			return new WindowsFactory();

		default:
			return null;
		}
	}
}
