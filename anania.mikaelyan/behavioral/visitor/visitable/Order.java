package com.synisys.training.patterns.behavioral.visitor.visitable;

import com.synisys.training.patterns.behavioral.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anania.Mikaelyan
 * @since 3/27/2015
 */
public class Order implements Visitable {
    private String name;

    private List<Item> items = new ArrayList<>();

    public Order(String name) {
        this.name = name;
    }

    public Order(String name, String itemName) {
        this.name = name;
        this.addItem(new Item(itemName));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Item item : items) {
            item.accept(visitor);
        }
    }


    public void addItem(Item item) {
        items.add(item);
    }
}
