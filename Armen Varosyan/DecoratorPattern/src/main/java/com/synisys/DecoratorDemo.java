package com.synisys;

import com.synisys.interfaces.Product;
import com.synisys.models.Banana;
import com.synisys.models.Boots;
import com.synisys.models.FruitDecorator;
import com.synisys.models.SportDecorator;

public class DecoratorDemo {
	public static void main(String[] args){
		Product banana = new Banana("Banana");
		Product boots = new Boots("Boots");
		
		Product sportDecorator = new SportDecorator(boots);
		Product fruitDecorator = new FruitDecorator(banana);
		System.out.println(banana.getDescription());
		System.out.println(fruitDecorator.getDescription());
		System.out.println(boots.getDescription());
		System.out.println(sportDecorator.getDescription());
		
	}
}
