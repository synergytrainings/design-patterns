package com.synisys.training.patterns.behavioral.chainofresponsibility;

/**
 * Handler
 * defines an interface for handling requests.
 * (optional) implements the successor link.
 * @author Anania.Mikaelyan
 * @since 12/9/2014
 */
public abstract class Approver {
    private Approver successor;

    public abstract void processRequest(Purchase purchase);

    public Approver getSuccessor() {
        return successor;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }
}
