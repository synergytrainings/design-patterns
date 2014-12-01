package com.synisys.designpatterns.flyweight.naturalproducts;

import com.synisys.designpatterns.flyweight.utils.Vitamin;

class Lemon extends NaturalProduct {
	
	Lemon(){
		vitmainWeights.put(Vitamin.B1, 0.04);
		vitmainWeights.put(Vitamin.B2, 0.02);
		vitmainWeights.put(Vitamin.B3, 0.1);
		vitmainWeights.put(Vitamin.B5, 0.19);
		vitmainWeights.put(Vitamin.B6, 0.08);
		vitmainWeights.put(Vitamin.B9, 0.011);
		vitmainWeights.put(Vitamin.C, 53d);
	}
}
