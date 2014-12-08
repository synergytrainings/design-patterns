package com.synisys.training.patterns.behavioral.chainofresponsibility;

/**
 * @author Anania.Mikaelyan
 * @since 12/9/2014
 */
public class Demo {
    public static void main(String[] args) {
        // Setup Chain of Responsibility
        Approver vasya = new Director();
        Approver bob = new VicePresident();
        Approver dasmond = new President();
        vasya.setSuccessor(bob);
        bob.setSuccessor(dasmond);

        // Generate and process purchase requests
        Purchase p = new Purchase(2034, 350, "Supplies");
        vasya.processRequest(p);
        p = new Purchase(2035, 32590, "Project X");
        vasya.processRequest(p);
        p = new Purchase(2036, 122100, "Project Y");
        vasya.processRequest(p);
    }

}
