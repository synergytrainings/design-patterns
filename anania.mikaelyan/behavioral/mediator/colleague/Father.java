package com.synisys.training.patterns.behavioral.mediator.colleague;

import java.math.BigDecimal;

/**
 * @author Anania.Mikaelyan
 * @since 3/30/2015
 */
public class Father extends FamilyMember {
    public Father(String name) {
        super(name);
    }

    public void gotSalary(BigDecimal salary) {
        System.out.println("Father got salary...");
        BigDecimal moneyForCar = BigDecimal.valueOf(10);
        family.income(salary.subtract(moneyForCar));
    }
}
