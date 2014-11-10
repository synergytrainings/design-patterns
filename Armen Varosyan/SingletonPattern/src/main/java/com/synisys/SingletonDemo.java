package com.synisys;

public class SingletonDemo {
	public static void main(String[] args){
		
		ProductManagerEnum.INSTANCE.getProducts();
		
		ProductManagerEagerInitialization.getInstance().getProducts();
		
		ProductManagerLazyInitialization.getInstance().getProducts();
		
		ProductManagerInnerClassInitialization.getInstance().getProducts();
	}
	
}
