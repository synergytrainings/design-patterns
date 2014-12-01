package abstractfactory.os;

/**
 * Operation system actions common for all type of OS
 * @author Karen Margaryan
 *
 */
public abstract class OperationSystem {
	/**
	 * This method runs the default terminal installed on the OS
	 */
	public abstract void runTerminal();
	
	/**
	 * This method runs the default office software installed on the OS
	 */
	public abstract void runOffice();
}
