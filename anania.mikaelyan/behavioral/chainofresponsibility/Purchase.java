package com.synisys.training.patterns.behavioral.chainofresponsibility;

/**
 * @author Anania.Mikaelyan
 * @since 12/9/2014
 */
public class Purchase {
    private final Integer number;
    private final Integer amount;
    private final String purpose;

    public Purchase(Integer number, Integer amount, String purpose) {
        this.number = number;
        this.amount = amount;
        this.purpose = purpose;
    }

    public Integer getNumber() {
        return number;
    }



    public Integer getAmount() {
        return amount;
    }



    public String getPurpose() {
        return purpose;
    }


}
