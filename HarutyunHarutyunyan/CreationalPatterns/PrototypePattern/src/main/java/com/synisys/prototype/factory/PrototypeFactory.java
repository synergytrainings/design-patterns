package com.synisys.prototype.factory;

import com.synisys.prototype.contract.PrototypeCapable;
import com.synisys.prototype.model.Activity;
import com.synisys.prototype.model.Project;
import com.synisys.prototype.model.Sector;

public class PrototypeFactory 
{
	public static class ModelType
	{
		public static final String SECTOR = "sector";
		public static final String PROJECT = "project";
		public static final String ACTIVITY = "activity";
	}
	private static java.util.Map<String, PrototypeCapable> prototypes = new java.util.HashMap<String, PrototypeCapable>();
	
	static 
	{
		prototypes.put(ModelType.SECTOR, new Sector());
		prototypes.put(ModelType.PROJECT, new Project());
		prototypes.put(ModelType.ACTIVITY, new Activity());
	}

	public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException {
		return ((PrototypeCapable) prototypes.get(s)).clone();
	}
}
