package com.synisys.training.patterns.behavioral.chainofresponsibility;

/**
 * @author Anania.Mikaelyan
 * @since 12/9/2014
 */
public class Director extends Approver {
    @Override
    public void processRequest(Purchase purchase) {
        if(purchase.getAmount() < 1000){
            System.out.println("Director approved request");
        }else if(getSuccessor()!=null){
            getSuccessor().processRequest(purchase);
        }
    }
}
