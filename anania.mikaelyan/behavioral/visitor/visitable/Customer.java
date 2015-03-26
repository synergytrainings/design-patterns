package com.synisys.training.patterns.behavioral.visitor.visitable;

import com.synisys.training.patterns.behavioral.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anania.Mikaelyan
 * @since 3/27/2015
 */
public class Customer implements Visitable {
    private String name;

    private List<Order> orders = new ArrayList<>();

    public void accept(Visitor visitor) {
        visitor.visit(this);

        for (Order order : orders) {
            order.accept(visitor);
        }

    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }


    public Customer(String name) {
        this.name = name;
    }
}
