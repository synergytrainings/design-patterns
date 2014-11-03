package com.synisys.idm.entity.fields;

import com.synisys.idm.entity.utils.FieldType;

public class NumberField extends Field {
	private int minValue;
	private int maxValue;
	
	protected NumberField(NumberFieldBuilder<?> builder){
		super(builder);
		
		if(builder.minValue == null || builder.maxValue == null){
			throw new IllegalStateException("Number field minimum or maximum values should be provided");
		}
		
		if(builder.minValue > builder.maxValue){
			throw new IllegalStateException("Number field minimum value can't not be greater than maximum value");
		}
		
		this.minValue = builder.minValue;
		this.maxValue = builder.maxValue;
	}
	
	public int getMinValue() {
		return minValue;
	}
	
	public int getMaxValue() {
		return maxValue;
	}
	
	public static NumberFieldBuilder<? extends NumberFieldBuilder<?>> createNumberFieldBuilder(){
		return new NumberFieldBuilder<>();
	}
	
	@SuppressWarnings("unchecked")
	public static class NumberFieldBuilder<T extends NumberFieldBuilder<T>> extends FieldBuilder<T>{
		private Integer minValue;
		private Integer maxValue;
		
		protected NumberFieldBuilder(){
			super(FieldType.NUMBER);
		}
		
		public T minValue(int minValue){
			this.minValue = minValue;
			return (T)this;
		}
		
		public T maxValue(int maxValue){
			this.maxValue = maxValue;
			return (T)this;
		}
		
		@Override
		public NumberField build() {
			return new NumberField(this);
		}
	}
}
