package com.synisys.designpatterns.flyweight.naturalproducts;

import com.synisys.designpatterns.flyweight.utils.Vitamin;

class Apple extends NaturalProduct {
	
	Apple(){
		vitmainWeights.put(Vitamin.A, 0.003);
		vitmainWeights.put(Vitamin.B1, 0.017);
		vitmainWeights.put(Vitamin.B2, 0.026);
		vitmainWeights.put(Vitamin.B3, 0.091);
		vitmainWeights.put(Vitamin.B5, 0.061);
		vitmainWeights.put(Vitamin.B6, 0.041);
		vitmainWeights.put(Vitamin.B9, 0.003);
		vitmainWeights.put(Vitamin.C, 4.6);
		vitmainWeights.put(Vitamin.E, 0.18);
		vitmainWeights.put(Vitamin.K, 0.0022);
	}
}
