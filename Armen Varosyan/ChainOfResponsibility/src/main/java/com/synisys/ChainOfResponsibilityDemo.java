package com.synisys;

import java.util.Scanner;

import com.synisys.interfaces.DispenseChain;
import com.synisys.models.Currency;
import com.synisys.models.Dollar10Dispenser;
import com.synisys.models.Dollar20Dispenser;
import com.synisys.models.Dollar50Dispenser;

public class ChainOfResponsibilityDemo {
	 private DispenseChain c1;
	 
	    public ChainOfResponsibilityDemo() {
	        // initialize the chain
	        this.c1 = new Dollar50Dispenser();
	        DispenseChain c2 = new Dollar20Dispenser();
	        DispenseChain c3 = new Dollar10Dispenser();
	 
	        // set the chain of responsibility
	        c1.setNextChain(c2);
	        c2.setNextChain(c3);
	    }
	 
	    public static void main(String[] args) {
	    	ChainOfResponsibilityDemo atmDispenser = new ChainOfResponsibilityDemo();
	        while (true) {
	            int amount = 0;
	            System.out.println("Enter amount to dispense");
	            Scanner input = new Scanner(System.in);
	            amount = input.nextInt();
	            if (amount % 10 != 0) {
	                System.out.println("Amount should be in multiple of 10s.");
	                return;
	            }
	            // process the request
	            atmDispenser.c1.dispense(new Currency(amount));
	        }
	 
	    }
}
