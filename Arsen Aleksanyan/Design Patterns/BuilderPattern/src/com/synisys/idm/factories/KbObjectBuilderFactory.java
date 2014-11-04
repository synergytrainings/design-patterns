package com.synisys.idm.factories;

import com.synisys.idm.entity.categories.Category;
import com.synisys.idm.entity.categories.Category.CategoryBuilder;
import com.synisys.idm.entity.fields.LookupField;
import com.synisys.idm.entity.fields.LookupField.LookupFieldBuilder;
import com.synisys.idm.entity.fields.NumberField;
import com.synisys.idm.entity.fields.TextField;
import com.synisys.idm.entity.fields.NumberField.NumberFieldBuilder;
import com.synisys.idm.entity.fields.TextField.TextFieldBuilder;

public class KbObjectBuilderFactory {
	public static CategoryBuilder<? extends CategoryBuilder<?>> createCategoryBuilder(){
		return Category.createCategoryBuilder();
	}
	
	public static NumberFieldBuilder<? extends NumberFieldBuilder<?>> createNumberFieldBuilder(){
		return NumberField.createNumberFieldBuilder();
	}
	
	public static TextFieldBuilder<? extends TextFieldBuilder<?>> createTextFieldBuilder(){
		return TextField.createTextFieldBuilder();
	}
	
	public static LookupFieldBuilder<? extends LookupFieldBuilder<?>> createLookupFieldBuilder(){
		return LookupField.createLookupFieldBuilder();
	}
}
