package com.synisys.os.gui.factory;

import com.synisys.os.gui.Button;
import com.synisys.os.gui.ComboBox;
import com.synisys.os.gui.EditBox;

public interface GUIFactory {
	Button createButton(String name);
	ComboBox createComboBox();
	EditBox createEditBox(String text);
}
