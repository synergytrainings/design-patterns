package com.synisys.training.patterns.behavioral.mediator.colleague;

import java.math.BigDecimal;

/**
 * @author Anania.Mikaelyan
 * @since 3/30/2015
 */
public class Mother extends FamilyMember {
    public Mother(String name) {
        super(name);
    }

    public void spendMoney(BigDecimal money, String expenditureTitle ) {
        family.outcome(money);
        System.out.println("Mother spend money on " + expenditureTitle);
    }
}
