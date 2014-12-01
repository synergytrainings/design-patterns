package com.synisys.designpatterns.flyweight.naturalproducts;


public enum Fruit implements NaturalProductType {
	APPLE("apple", Apple.class),
	ORANGE("orange", Orange.class),
	PEACH("peach", Peach.class),
	GRAPEFRUIT("grapefruit", Grapefruit.class),
	LIME("lime", Lime.class),
	LEMON("lemon", Lemon.class),
	STRAWBERRY("strawberry", Strawberry.class);
	
	private String key;
	private Class<? extends NaturalProduct> productClass;
	
	private Fruit(String key, Class<? extends NaturalProduct> productClass){
		this.key = key;
		this.productClass = productClass;
	}
	
	@Override
	public String getKey() {
		return key;
	}
	
	@Override
	public Class<? extends NaturalProduct> getProductClass() {
		return productClass;
	}
}
