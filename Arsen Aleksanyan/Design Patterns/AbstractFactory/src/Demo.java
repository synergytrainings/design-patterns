package com.synisys.os.gui.demo;

import com.synisys.os.gui.factory.GUIFactory;
import com.synisys.os.gui.factory.LinuxGUIFactory;

public class Demo {
	//Inject
	private GUIFactory factory = new LinuxGUIFactory();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Demo().test();
	}
	
	private void test(){
		factory.createButton("Button").draw();
		factory.createComboBox().draw();
		factory.createEditBox("Edit Box").draw();
	}
}
