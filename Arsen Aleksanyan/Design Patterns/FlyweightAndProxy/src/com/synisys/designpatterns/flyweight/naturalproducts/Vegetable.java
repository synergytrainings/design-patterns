package com.synisys.designpatterns.flyweight.naturalproducts;


public enum Vegetable implements NaturalProductType {
	CARROT("carrot", Carrot.class),
	WATERMELON("watermelon", Watermelon.class);
	
	private String key;
	private Class<? extends NaturalProduct> productClass;
	
	private Vegetable(String key, Class<? extends NaturalProduct> productClass){
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