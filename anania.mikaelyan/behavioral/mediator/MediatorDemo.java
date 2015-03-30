package com.synisys.training.patterns.behavioral.mediator;

import com.synisys.training.patterns.behavioral.mediator.colleague.Child;
import com.synisys.training.patterns.behavioral.mediator.colleague.Father;
import com.synisys.training.patterns.behavioral.mediator.colleague.Mother;
import com.synisys.training.patterns.behavioral.mediator.mediator.Family;

import java.math.BigDecimal;

/**
 * @author Anania.Mikaelyan
 * @since 3/30/2015
 */
public class MediatorDemo {
    public static void main(String[] args) {
        Father father = new Father("Mamikon");
        Mother mother = new Mother("Heriqnaz");
        Family family = Family.getMarried(father, mother);
        family.makeBaby(new Child("Vardanchik"));
        family.makeBaby(new Child("Adelaida"));
        father.gotSalary(BigDecimal.valueOf(1000));
        father.gotSalary(BigDecimal.valueOf(1000));
        father.gotSalary(BigDecimal.valueOf(1000));
    }
}
