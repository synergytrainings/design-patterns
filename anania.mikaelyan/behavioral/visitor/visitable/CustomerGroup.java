package com.synisys.training.patterns.behavioral.visitor.visitable;

import com.synisys.training.patterns.behavioral.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anania.Mikaelyan
 * @since 3/27/2015
 */
public class CustomerGroup implements Visitable{
    private List<Customer> customers = new ArrayList<>();

    public void accept(Visitor visitor){
        for (Customer customer : customers){
            customer.accept(visitor);
        }
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }
}

