package com.synisys.os.gui.factory;

import com.synisys.os.gui.Button;
import com.synisys.os.gui.ComboBox;
import com.synisys.os.gui.EditBox;
import com.synisys.os.gui.windows.impl.WindowsButton;
import com.synisys.os.gui.windows.impl.WindowsComboBox;
import com.synisys.os.gui.windows.impl.WindowsEditBox;

public class WindowsGUIFactory implements GUIFactory {
	@Override
	public Button createButton(String name) {
		return new WindowsButton(name);
	}
	
	@Override
	public ComboBox createComboBox() {
		return new WindowsComboBox();
	}
	
	@Override
	public EditBox createEditBox(String text) {
		return new WindowsEditBox(text);
	}
}
