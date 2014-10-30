package abstractfactory.os.windows;

import abstractfactory.os.OperationSystem;

public class Windows7 extends OperationSystem {

	@Override
	public void runTerminal() {
		System.out.println("Running Windows 7 CMD terminal");

	}

	@Override
	public void runOffice() {
		System.out.println("Running Windows 7 MS Office 2010");

	}

}
