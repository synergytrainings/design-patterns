package com.synisys.idm.entity;

import com.synisys.idm.entity.utils.Origin;

public abstract class BaseKbObject {
	private Integer id;
	private String name;
	private String description;
	private Origin origin;
	
	protected BaseKbObject(BaseKbObjectBuilder<?> builder){
		if(builder.id == null || builder.name == null || builder.origin == null){
			throw new IllegalStateException("Id, name and origin properties are required for this type of KB object");
		}
		
		this.id = builder.id;
		this.name = builder.name;
		this.description = builder.description;
		this.origin = builder.origin;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Origin getOrigin() {
		return origin;
	}
	
	@SuppressWarnings("unchecked")
	public static abstract class BaseKbObjectBuilder<T extends BaseKbObjectBuilder<T>>{
		private Integer id;
		private String name;
		private String description;
		private Origin origin;
		
		protected BaseKbObjectBuilder(){
			//Hiding the constructor
		}
		
		public T id(int id){
			this.id = id;
			return (T)this;
		}
		
		public T name(String name){
			this.name = name;
			return (T)this;
		}
		
		public T description(String description){
			this.description = description;
			return (T)this;
		}
		
		public T origin(Origin origin){
			this.origin = origin;
			return (T)this;
		}
		
		protected abstract BaseKbObject build();
	}
}
