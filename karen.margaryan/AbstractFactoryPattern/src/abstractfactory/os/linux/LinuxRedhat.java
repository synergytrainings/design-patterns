package abstractfactory.os.linux;

import abstractfactory.os.OperationSystem;

/**
 * Linux Redhat operation system class
 * @author Karen
 *
 */
public class LinuxRedhat extends OperationSystem {

	@Override
	public void runTerminal() {
		System.out.println("Running Linux Redhat CShell terminal");

	}

	@Override
	public void runOffice() {
		System.out.println("Running Linux Redhat OpenOffice");

	}

}
