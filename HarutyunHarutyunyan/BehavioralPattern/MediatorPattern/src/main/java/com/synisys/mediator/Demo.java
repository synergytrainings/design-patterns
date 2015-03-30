package com.synisys.mediator;

public class Demo {
	public static void main(String[] args) {
		Mediator mediator = new MediatorImpl();
        Indicator indicator1 = new Indicator(mediator, 1, 1);
        Indicator indicator2 = new Indicator(mediator, 2, 2);
        Indicator indicator3 = new Indicator(mediator, 1, 3);
        Indicator indicator4 = new Indicator(mediator, 1, 4);
        mediator.addIndicator(indicator1);
        mediator.addIndicator(indicator2);
        mediator.addIndicator(indicator3);
        mediator.addIndicator(indicator4);
         
        indicator1.setSOs(2);
        
        for(Indicator ind : mediator.getIndicators()){
        	System.out.println(ind.getSoId());
        }
	}
}
