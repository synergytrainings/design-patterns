package com.synisys.os.gui.factory;

import com.synisys.os.gui.Button;
import com.synisys.os.gui.ComboBox;
import com.synisys.os.gui.EditBox;
import com.synisys.os.gui.linux.impl.LinuxButton;
import com.synisys.os.gui.linux.impl.LinuxComboBox;
import com.synisys.os.gui.linux.impl.LinuxEditBox;

public class LinuxGUIFactory implements GUIFactory {
	@Override
	public Button createButton(String name) {
		return new LinuxButton(name);
	}
	
	@Override
	public ComboBox createComboBox() {
		return new LinuxComboBox();
	}
	
	@Override
	public EditBox createEditBox(String text) {
		return new LinuxEditBox(text);
	}
}
