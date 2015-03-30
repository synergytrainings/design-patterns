package com.synisys.training.patterns.behavioral.mediator.mediator;

import com.synisys.training.patterns.behavioral.mediator.colleague.Child;
import com.synisys.training.patterns.behavioral.mediator.colleague.Father;
import com.synisys.training.patterns.behavioral.mediator.colleague.Mother;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Anania.Mikaelyan
 * @since 3/30/2015
 */
public class Family {
    private Father father;
    private Mother mother;
    private List<Child> children;

    private BigDecimal familyBudget;

    private Family(Father father, Mother mother) {
        this.father = father;
        this.mother = mother;
        this.children = new ArrayList<>(3);
        this.father.setFamily(this);
        this.mother.setFamily(this);
        this.familyBudget = BigDecimal.ZERO;
    }

    public static Family getMarried(Father father, Mother mother) {
       return new Family(father, mother);
    }

    public void makeBaby(Child child){
        child.setFamily(this);
        this.children.add(child);
    }

    public void income(BigDecimal income){
        familyBudget = familyBudget.add(income);
        BigDecimal moneyForShuba = BigDecimal.valueOf(2500);
        if(familyBudget.compareTo(moneyForShuba) > 0){
            mother.spendMoney(moneyForShuba, "Shuba caxs");
        }
    }

    public void outcome(BigDecimal outcome){
        familyBudget = familyBudget.subtract(outcome);
    }

    public BigDecimal getFamilyBudget() {
        return familyBudget;
    }
}
