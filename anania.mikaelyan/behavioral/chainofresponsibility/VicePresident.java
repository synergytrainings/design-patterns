package com.synisys.training.patterns.behavioral.chainofresponsibility;

/**
 * @author Anania.Mikaelyan
 * @since 12/9/2014
 */
public class VicePresident extends Approver {
    @Override
    public void processRequest(Purchase purchase) {
        if(purchase.getAmount() < 100000){
            System.out.println("VicePresident approved request");
        }else if(getSuccessor()!=null){
            getSuccessor().processRequest(purchase);
        }
    }
}
