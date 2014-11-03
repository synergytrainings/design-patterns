package com.synisys.idm.entity.categories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.synisys.idm.entity.BaseKbObject;
import com.synisys.idm.entity.fields.Field;

public class Category extends BaseKbObject {
	private List<Field> fields;
	
	protected Category(CategoryBuilder<?> builder){
		super(builder);
		
		if(!builder.fields.isEmpty()){
			this.fields = new ArrayList<>();
			this.fields.addAll(builder.fields);
		}
	}
	
	public List<Field> getFields() {
		return Collections.unmodifiableList(this.fields);
	}
	
	public static CategoryBuilder<? extends CategoryBuilder<?>> createCategoryBuilder(){
		return new CategoryBuilder<>();
	}
	
	@SuppressWarnings("unchecked")
	public static class CategoryBuilder<T extends CategoryBuilder<T>> extends BaseKbObjectBuilder<T>{
		private List<Field> fields = new ArrayList<Field>();
		
		protected CategoryBuilder(){
			//Hiding constructor
		}
		
		public T addField(Field field){
			this.fields.add(field);
			return (T)this;
		}
		
		@Override
		public Category build() {
			return new Category(this);
		}
	}
}
