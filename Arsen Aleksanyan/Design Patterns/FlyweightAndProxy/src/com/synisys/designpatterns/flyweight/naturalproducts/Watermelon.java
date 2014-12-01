package com.synisys.designpatterns.flyweight.naturalproducts;

import com.synisys.designpatterns.flyweight.utils.Vitamin;

class Watermelon extends NaturalProduct {

	Watermelon(){
		vitmainWeights.put(Vitamin.A, 0.028);
		vitmainWeights.put(Vitamin.B1, 0.033);
		vitmainWeights.put(Vitamin.B2, 0.021);
		vitmainWeights.put(Vitamin.B3, 0.178);
		vitmainWeights.put(Vitamin.B5, 0.221);
		vitmainWeights.put(Vitamin.B6, 0.045);
		vitmainWeights.put(Vitamin.C, 8.1);
	}
}
