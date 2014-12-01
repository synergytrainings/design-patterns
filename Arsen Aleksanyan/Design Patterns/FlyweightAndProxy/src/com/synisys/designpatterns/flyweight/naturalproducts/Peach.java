package com.synisys.designpatterns.flyweight.naturalproducts;

import com.synisys.designpatterns.flyweight.utils.Vitamin;

class Peach extends NaturalProduct {
	
	Peach(){
		vitmainWeights.put(Vitamin.A, 0.016);
		vitmainWeights.put(Vitamin.B1, 0.024);
		vitmainWeights.put(Vitamin.B2, 0.031);
		vitmainWeights.put(Vitamin.B3, 0.806);
		vitmainWeights.put(Vitamin.B5, 0.153);
		vitmainWeights.put(Vitamin.B6, 0.025);
		vitmainWeights.put(Vitamin.B9, 0.004);
		vitmainWeights.put(Vitamin.C, 6.6);
		vitmainWeights.put(Vitamin.E, 0.73);
		vitmainWeights.put(Vitamin.K, 0.0026);
	}
}
