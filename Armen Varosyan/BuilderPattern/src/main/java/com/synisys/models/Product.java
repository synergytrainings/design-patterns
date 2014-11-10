package com.synisys.models;

import com.synisys.utils.ProductType;

public class Product {
	private String name;
	private Integer price;
	private ProductType productType;
	
	private Product(ProductBuilder productBuilder){
		this.name = productBuilder.name;
	}

	public String getName() {
		return name;
	}

	public Integer getPrice() {
		return price;
	}

	public ProductType getProductType() {
		return productType;
	}

	public static class ProductBuilder {
		private String name;
		private Integer price;
		private ProductType productType;
		
		

		public ProductBuilder name(String name) {
			this.name = name;
			return this;
		}

		public ProductBuilder price(Integer price) {
			this.price = price;
			return this;
		}
		
		public ProductBuilder productType(ProductType productType) {
			this.productType = productType;
			return this;
		}

		public Product build() {
			if(this.productType == null){
				new IllegalAccessException("Not specified Product Type");
				
			}
			return new Product(this);
		}

		
		
	}

}
