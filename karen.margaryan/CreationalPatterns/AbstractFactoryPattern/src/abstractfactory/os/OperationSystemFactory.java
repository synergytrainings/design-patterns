package abstractfactory.os;

/**
 * Gets the operation system creating factory method based on the given version
 * 
 * @author Karen Margaryan
 * 
 */
public interface OperationSystemFactory {
	/**
	 * Creates operation system instance based on the given version
	 * 
	 * @param version
	 *            operation system type (@see LInuxType or WindowsType as an
	 *            example of parameter)
	 * @return
	 */
	public abstract OperationSystem createOperationSystem(String version);
}
