package com.synisys.designpatterns.flyweight.naturalproducts;

import com.synisys.designpatterns.flyweight.utils.Vitamin;

class Strawberry extends NaturalProduct {

	Strawberry(){
		vitmainWeights.put(Vitamin.B1, 0.024);
		vitmainWeights.put(Vitamin.B2, 0.022);
		vitmainWeights.put(Vitamin.B3, 0.386);
		vitmainWeights.put(Vitamin.B5, 0.125);
		vitmainWeights.put(Vitamin.B6, 0.047);
		vitmainWeights.put(Vitamin.B9, 0.0024);
		vitmainWeights.put(Vitamin.C, 58.8);
		vitmainWeights.put(Vitamin.E, 0.29);
		vitmainWeights.put(Vitamin.K, 0.0022);
	}
}
