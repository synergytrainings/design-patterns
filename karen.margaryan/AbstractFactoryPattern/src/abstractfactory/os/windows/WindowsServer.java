package abstractfactory.os.windows;

import abstractfactory.os.OperationSystem;

/**
 * Windows server operation system class
 * @author Karen
 *
 */
public class WindowsServer extends OperationSystem {

	@Override
	public void runTerminal() {
		System.out.println("Running Windows Server CMD terminal");

	}

	@Override
	public void runOffice() {
		System.out.println("Running Windows Server MS Office 2003");

	}

}
