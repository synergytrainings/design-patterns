package abstractfactory.os.linux;

import abstractfactory.os.OperationSystem;

/**
 * Linux ubuntu operation system class
 * @author Karen
 *
 */
public class LinuxUbuntu extends OperationSystem {

	@Override
	public void runTerminal() {
		System.out.println("Running Linux Ubuntu CShell terminal");

	}

	@Override
	public void runOffice() {
		System.out.println("Running Linux Ubuntu OpenOffice");

	}

}
