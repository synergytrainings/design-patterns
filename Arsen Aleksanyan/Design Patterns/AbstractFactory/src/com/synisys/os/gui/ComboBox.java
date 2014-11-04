package com.synisys.os.gui;

import java.util.Collection;

public interface ComboBox extends UIComponent{
	void setValues(Collection<String> values);
	Collection<String> getValues();
}
