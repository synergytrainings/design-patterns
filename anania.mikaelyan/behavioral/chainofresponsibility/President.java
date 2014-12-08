package com.synisys.training.patterns.behavioral.chainofresponsibility;

/**
 * @author Anania.Mikaelyan
 * @since 12/9/2014
 */
public class President extends Approver {
    @Override
    public void processRequest(Purchase purchase) {
        if(purchase.getAmount() < 10000000){
            System.out.println("President approved request");
        }else if(getSuccessor()!=null){
            throw new IllegalArgumentException("Wow");
        }
    }
}
