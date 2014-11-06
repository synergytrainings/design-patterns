package com.synisys.training.patterns.prototype;

import java.util.HashMap;
import java.util.Map;


public  class  PrototypeFactory {
	private  static Map<Class<?>, Shape> prototypes = new HashMap();
	static
	{
		prototypes.put(Circle.class, new Circle(10, "Green", true));
		prototypes.put(Square.class, new Square(15, "Black", false));
		prototypes.put(Rectangle.class, new Rectangle(10, 15, "White", true));
	}


	public  static Shape createInstance(Class<?> clazz)  {
		if(!prototypes.containsKey(clazz)){
			throw new IllegalArgumentException(String.format("Unknown type of shape: %s", clazz));
		}
		return prototypes.get(clazz).clone();
	}
}
