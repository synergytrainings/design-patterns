package com.synisys.training.patterns.behavioral.state;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author Anania.Mikaelyan
 * @since 4/9/2015
 */
public class StateDemo {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testState(){
        DeForm deForm = new DeForm();
        deForm.setCurrentState(DeStates.NEW);

        //saves from new  - > edit
        deForm.save();
        Assert.assertEquals(DeStates.EDIT, deForm.getCurrentState());

        //saves from edit  - > edit
        deForm.save();
        Assert.assertEquals(DeStates.EDIT, deForm.getCurrentState());

        //saves and close from edit  - > view
        deForm.saveClose();
        Assert.assertEquals(DeStates.VIEW, deForm.getCurrentState());

        //saves in  view state - > exception
        exception.expect(IllegalStateException.class);
        deForm.saveClose();

    }
}
