package com.synisys.training.patterns.structural.composite;

import org.junit.Test;

import javax.naming.OperationNotSupportedException;

/**
 * @author Anania.Mikaelyan
 * @since 11/20/2014
 */
public class Client {
    @Test
    public void demoComposite() throws OperationNotSupportedException {
        Entity root = new ComplexEntity();

        Entity left = new ComplexEntity();
        left.addSubEntity(new SimpleEntity("Entity_L_11"));
        left.addSubEntity(new SimpleEntity("Entity_L_12"));


        Entity right = new ComplexEntity();
        right.addSubEntity(new SimpleEntity("Entity_R_21"));
        right.addSubEntity(new SimpleEntity("Entity_L_22"));

        root.addSubEntity(left);
        root.addSubEntity(right);

        root.addSubEntity(new SimpleEntity("Entity_1"));
        root.addSubEntity(new SimpleEntity("Entity_2"));

        root.process();
    }
}
