package com.synisys;

public class ProductFactory {
	public static AbstractFactory getFactory(String choice){
	      if(choice.equalsIgnoreCase("SELLING")){
	         return new MarketFactory();
	      } else if(choice.equalsIgnoreCase("MARKET")){
	         return new AuctionFactory();
	      }
	      return null;
	   }
}
