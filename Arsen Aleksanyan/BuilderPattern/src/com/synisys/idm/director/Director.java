package com.synisys.idm.director;

import com.synisys.idm.entity.categories.Category;
import com.synisys.idm.entity.fields.Field;
import com.synisys.idm.entity.fields.NumberField;
import com.synisys.idm.entity.utils.Origin;
import com.synisys.idm.factories.KbObjectBuilderFactory;

public class Director {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		Field yearIdField = KbObjectBuilderFactory.createNumberFieldBuilder()
				.id(7)
				.name("Id Field")
				.origin(Origin.SYSTEM)
				.minValue(0)
				.maxValue(65536)
				.mandatory(true)
				.unique(true)
				.build();
		
		Field yearNameField = KbObjectBuilderFactory.createTextFieldBuilder()
				.id(11)
				.name("Year Name")
				.origin(Origin.SYSTEM)
				.maxChars(255)
				.mandatory(true)
				.build();
		
		Category year = KbObjectBuilderFactory.createCategoryBuilder()
				.id(15)
				.name("Year")
				.origin(Origin.SYSTEM)
					.addField(yearIdField)
					.addField(yearNameField)
				.build();
		
		Field yearLookupField = KbObjectBuilderFactory.createLookupFieldBuilder()
				.id(22)
				.name("Project lookup")
				.description("Lookups to Project category")
				.lookup(year)
				.origin(Origin.USER_DEFINED)
				.build();
		
		Category project = KbObjectBuilderFactory.createCategoryBuilder()
				.id(10)
				.name("Project")
				.origin(Origin.USER_DEFINED)
					.addField(yearLookupField)
				.build();
	}

}
