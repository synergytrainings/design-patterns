package com.synisys.idm.entity.fields;

import com.synisys.idm.entity.utils.FieldType;

public class TextField extends Field {
	private int maxChars;
	
	protected TextField(TextFieldBuilder<?> builder){
		super(builder);
		
		if(builder.maxChars == null){
			throw new IllegalArgumentException("Maximum number of characters should be specified");
		}
		
		this.maxChars = builder.maxChars;
	}
	
	public int getMaxChars() {
		return maxChars;
	}
	
	public static TextFieldBuilder<? extends TextFieldBuilder<?>> createTextFieldBuilder(){
		return new TextFieldBuilder<>();
	}
	
	@SuppressWarnings("unchecked")
	public static class TextFieldBuilder<T extends TextFieldBuilder<T>> extends FieldBuilder<T>{
		private Integer maxChars;
		
		protected TextFieldBuilder(){
			super(FieldType.TEXT);
		}
		
		public T maxChars(Integer maxChars){
			this.maxChars = maxChars;
			return (T)this;
		}
		
		@Override
		public TextField build() {
			return new TextField(this);
		}
	}
}
