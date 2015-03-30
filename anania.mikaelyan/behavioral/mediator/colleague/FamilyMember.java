package com.synisys.training.patterns.behavioral.mediator.colleague;

import com.synisys.training.patterns.behavioral.mediator.mediator.Family;

/**
 *
 * Participant(Collegue) - defines an interface for the participants
 *
 * @author Anania.Mikaelyan
 * @since 3/30/2015
 */
public abstract class FamilyMember {
    protected Family family;
    private String name;

    public FamilyMember(String name) {
        this.name = name;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}
