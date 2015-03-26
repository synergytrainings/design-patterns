package com.synisys.indicatorVisitor;

public class TestVisitor {
	public static void main(String[] args) {
        Indicator[] indicators = new Indicator[]{new LayeredIndicator(),new DelayeredIndicator()};
         
        preparingJsons(indicators);
    }
 
    private static void preparingJsons(Indicator[] indicators) {
        IndicatorVisitor visitor = new IndicatorVisitorImpl();
        for(Indicator indicator : indicators){
            indicator.accept(visitor);
        }
    }
}
