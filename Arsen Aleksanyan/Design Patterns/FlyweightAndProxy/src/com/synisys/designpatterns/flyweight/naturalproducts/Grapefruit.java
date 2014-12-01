package com.synisys.designpatterns.flyweight.naturalproducts;

import com.synisys.designpatterns.flyweight.utils.Vitamin;

class Grapefruit extends NaturalProduct {
	
	Grapefruit(){
		vitmainWeights.put(Vitamin.B1, 0.037);
		vitmainWeights.put(Vitamin.B2, 0.02);
		vitmainWeights.put(Vitamin.B3, 0.269);
		vitmainWeights.put(Vitamin.B5, 0.283);
		vitmainWeights.put(Vitamin.B6, 0.043);
		vitmainWeights.put(Vitamin.B9, 0.01);
		vitmainWeights.put(Vitamin.C, 33.3);
		vitmainWeights.put(Vitamin.E, 0.13);
	}
}
