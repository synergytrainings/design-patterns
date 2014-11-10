package com.synisys.models;

public abstract class Product implements Cloneable {
	private Integer price;
	private String name;

	public Product(Integer price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public Product clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError(e);
		}
		return (Product) clone;
	}
}
