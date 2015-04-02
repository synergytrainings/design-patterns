package com.synisys.memento;

import java.math.BigDecimal;

public class GiftCard {
	private String cardNumber;
    private BigDecimal balance;
     
    public GiftCard(String cardNumber){
        this.cardNumber = cardNumber;
        this.balance = new BigDecimal(5000);
    }
     
    @Override
    public String toString(){
        return this.balance.toString();
    }
     
    public void buy(BigDecimal price){
        balance = balance.subtract(price);
    }
     
    public Memento save(){
        return new Memento(this.balance);
    }
     
    public void undoToLastSave(Object obj){
        Memento memento = (Memento) obj;
        this.balance = memento.balance;
    }
     
     
    private class Memento{
        private BigDecimal balance;
         
        public Memento(BigDecimal content){
            this.balance = content;
        }
    }
}
