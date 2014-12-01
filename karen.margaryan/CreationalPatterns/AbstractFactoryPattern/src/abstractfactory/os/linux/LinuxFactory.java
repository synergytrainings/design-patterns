package abstractfactory.os.linux;

import abstractfactory.os.OperationSystem;
import abstractfactory.os.OperationSystemFactory;

/**
 * Linux factory class is using to create a concrete type of linux instance
 * @author Karen Margaryan
 * 
 */
public class LinuxFactory implements OperationSystemFactory {

	@Override
	public OperationSystem createOperationSystem(String type) {
		OperationSystem os = null;

		switch (type) {
		case LinuxType.REDHAT:
			os = new LinuxRedhat();
			break;

		case LinuxType.UBUNTU:
			os = new LinuxUbuntu();
			break;
		}

		return os;
	}
}
