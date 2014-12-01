package com.synisys.designpatterns.flyweight.naturalproducts;

import com.synisys.designpatterns.flyweight.utils.Vitamin;

class Orange extends NaturalProduct {

	Orange(){
		vitmainWeights.put(Vitamin.A, 0.011);
		vitmainWeights.put(Vitamin.B1, 0.087);
		vitmainWeights.put(Vitamin.B2, 0.04);
		vitmainWeights.put(Vitamin.B3, 0.282);
		vitmainWeights.put(Vitamin.B5, 0.25);
		vitmainWeights.put(Vitamin.B6, 0.06);
		vitmainWeights.put(Vitamin.B9, 0.03);
		vitmainWeights.put(Vitamin.C, 53.2);
		vitmainWeights.put(Vitamin.E, 0.18);
	}
}
