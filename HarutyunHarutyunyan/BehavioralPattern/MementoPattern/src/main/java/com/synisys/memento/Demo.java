package com.synisys.memento;

import java.math.BigDecimal;

public class Demo {
	public static void main(String[] args) {
        
        CardCaretaker caretaker = new CardCaretaker();
         
        GiftCard card = new GiftCard("479842934224");
        
        card.buy(new BigDecimal(1000));
      
        System.out.println(card);
         
        caretaker.save(card);

        card.buy(new BigDecimal(3000));
         
        System.out.println(card);
 
        caretaker.undo(card);
         
        System.out.println(card);
         
    }
}
