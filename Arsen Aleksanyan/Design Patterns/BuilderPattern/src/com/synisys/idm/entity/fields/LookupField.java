package com.synisys.idm.entity.fields;

import com.synisys.idm.entity.categories.Category;
import com.synisys.idm.entity.utils.FieldType;

public class LookupField extends Field {
	private Category lookupCategory;

	protected LookupField(LookupFieldBuilder<?> builder){
		super(builder);
		
		if(builder.lookupCategory == null){
			throw new IllegalArgumentException("Lookup category should be provided");
		}
		
		this.lookupCategory = builder.lookupCategory;
	}
	
	public Category getLookupCategory() {
		return lookupCategory;
	}
	
	public static LookupFieldBuilder<? extends LookupFieldBuilder<?>> createLookupFieldBuilder(){
		return new LookupFieldBuilder<>();
	}
	
	@SuppressWarnings("unchecked")
	public static class LookupFieldBuilder<T extends LookupFieldBuilder<T>> extends FieldBuilder<T>{
		private Category lookupCategory;
		
		protected LookupFieldBuilder(){
			super(FieldType.LOOKUP);
		}
		
		public T lookup(Category lookupCategory){
			this.lookupCategory = lookupCategory;
			return (T)this;
		}
		
		@Override
		public LookupField build() {
			return new LookupField(this);
		}
	}
}
