package com.synisys.training.patterns.behavioral.visitor.visitable;

import com.synisys.training.patterns.behavioral.visitor.visitor.Visitor;

/**
 * @author Anania.Mikaelyan
 * @since 3/27/2015
 */
public class Item implements Visitable {
    private String name;

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
