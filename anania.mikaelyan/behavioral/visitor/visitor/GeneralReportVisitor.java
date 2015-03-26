package com.synisys.training.patterns.behavioral.visitor.visitor;

import com.synisys.training.patterns.behavioral.visitor.visitable.Customer;
import com.synisys.training.patterns.behavioral.visitor.visitable.Item;
import com.synisys.training.patterns.behavioral.visitor.visitable.Order;

/**
 * @author Anania.Mikaelyan
 * @since 3/27/2015
 */
public class GeneralReportVisitor implements Visitor {
    private int customersNo;
    private int ordersNo;
    private int itemsNo;

    public void visit(Customer customer) {
        System.out.println(customer.getName());
        customersNo++;
    }

    public void visit(Order order) {
        System.out.println(order.getName());
        ordersNo++;
    }

    public void visit(Item item) {
        System.out.println(item.getName());
        itemsNo++;
    }

    public void displayResults() {
        System.out.println("No of customers:" + customersNo);
        System.out.println("No of orders:   " + ordersNo);
        System.out.println("No of itemss:   " + itemsNo);
    }

}
