package com.synisys.designpatterns.flyweight.naturalproducts;

import com.synisys.designpatterns.flyweight.utils.Vitamin;

class Carrot extends NaturalProduct {
	
	Carrot(){
		vitmainWeights.put(Vitamin.A, 0.835);
		vitmainWeights.put(Vitamin.B1, 0.066);
		vitmainWeights.put(Vitamin.B2, 0.058);
		vitmainWeights.put(Vitamin.B3, 0.983);
		vitmainWeights.put(Vitamin.B5, 0.273);
		vitmainWeights.put(Vitamin.B6, 0.138);
		vitmainWeights.put(Vitamin.B9, 0.0019);
		vitmainWeights.put(Vitamin.C, 5.9);
		vitmainWeights.put(Vitamin.E, 0.66);
	}
}
