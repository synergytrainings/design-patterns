package com.synisys.os.gui.impl;

import java.util.Collection;

import com.synisys.os.gui.ComboBox;

public abstract class ComboBoxImpl implements ComboBox {
	private Collection<String> values;
	
	@Override
	public void setValues(Collection<String> values) {
		this.values = values;
	}
	
	@Override
	public Collection<String> getValues() {
		return values;
	}
}
