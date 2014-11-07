package com.synisys;

import com.synisys.interfaces.Product;
import com.synisys.utils.ProductType;

public abstract class AbstractFactory {
	 abstract Product getProduct(ProductType type) ;
}
