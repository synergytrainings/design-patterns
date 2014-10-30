package abstractfactory.os.windows;

import abstractfactory.os.OperationSystem;
import abstractfactory.os.OperationSystemFactory;

/**
 * Windows factory class is using to create a concrete type of linux instance
 * @author Karen Margaryan
 * 
 */
public class WindowsFactory implements OperationSystemFactory {

	@Override
	public OperationSystem createOperationSystem(String type) {
		OperationSystem os = null;
		
		switch (type) {
		case WindowsType.WINDOWS_7:
			os = new Windows7();
			break;
			
		case WindowsType.WINDOWS_SERVER:
			os = new WindowsServer();
			break;
		}
		
		return os;
	}
}
