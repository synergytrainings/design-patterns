package com.synisys.designpatterns.flyweight.naturalproducts;


public interface NaturalProductType {
	String getKey();
	Class<? extends NaturalProduct> getProductClass();
}
