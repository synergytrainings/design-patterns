package com.synisys.idm.entity.fields;

import com.synisys.idm.entity.BaseKbObject;
import com.synisys.idm.entity.utils.FieldType;

public abstract class Field extends BaseKbObject {
	private boolean isMandatory;
	private boolean isUnique;
	private FieldType fieldType;

	protected Field(FieldBuilder<?> builder){
		super(builder);
		
		if(builder.fieldType == null){
			throw new IllegalStateException("Field type can't be null");
		}
		
		this.isMandatory = builder.isMandatory;
		this.isUnique = builder.isUnique;
		this.fieldType = builder.fieldType;
	}
	
	public FieldType getFieldType() {
		return fieldType;
	}
	
	public boolean isMandatory() {
		return isMandatory;
	}
	
	public boolean isUnique() {
		return isUnique;
	}
	
	@SuppressWarnings("unchecked")
	public static abstract class FieldBuilder<T extends FieldBuilder<T>> extends BaseKbObjectBuilder<T>{
		private boolean isUnique;
		private boolean isMandatory;
		private FieldType fieldType;
		
		protected FieldBuilder(FieldType fieldType){
			super();
			this.fieldType = fieldType;
		}
		
		public T unique(boolean isUnique){
			this.isUnique = isUnique;
			return (T)this;
		}
		
		public T mandatory(boolean isMandatory){
			this.isMandatory = isMandatory;
			return (T)this;
		}
	}
}
