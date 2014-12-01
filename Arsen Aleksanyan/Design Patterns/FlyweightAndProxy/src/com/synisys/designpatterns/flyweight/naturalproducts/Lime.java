package com.synisys.designpatterns.flyweight.naturalproducts;

import com.synisys.designpatterns.flyweight.utils.Vitamin;

class Lime extends NaturalProduct {
	
	Lime(){
		vitmainWeights.put(Vitamin.B1, 0.03);
		vitmainWeights.put(Vitamin.B2, 0.02);
		vitmainWeights.put(Vitamin.B3, 0.2);
		vitmainWeights.put(Vitamin.B5, 0.217);
		vitmainWeights.put(Vitamin.B6, 0.046);
		vitmainWeights.put(Vitamin.B9, 0.008);
		vitmainWeights.put(Vitamin.C, 29.1);
	}
}
