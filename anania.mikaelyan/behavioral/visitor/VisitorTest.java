package com.synisys.training.patterns.behavioral.visitor;

import com.synisys.training.patterns.behavioral.visitor.visitable.Customer;
import com.synisys.training.patterns.behavioral.visitor.visitable.CustomerGroup;
import com.synisys.training.patterns.behavioral.visitor.visitable.Item;
import com.synisys.training.patterns.behavioral.visitor.visitable.Order;
import com.synisys.training.patterns.behavioral.visitor.visitor.GeneralReportVisitor;

/**
 * @author Anania.Mikaelyan
 * @since 3/27/2015
 */
public class VisitorTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("customer1");
        customer1.addOrder(new Order(".order1", "..item1"));
        customer1.addOrder(new Order(".order2", "..item1"));
        customer1.addOrder(new Order(".order3", "..item1"));

        Customer customer2 = new Customer("customer2");
        Order order = new Order(".order_a");
        order.addItem(new Item("..item_a1"));
        order.addItem(new Item("..item_a2"));
        order.addItem(new Item("..item_a3"));
        customer2.addOrder(order);
        customer2.addOrder(new Order(".order_b", "..item_b1"));


        CustomerGroup customers = new CustomerGroup();
        customers.addCustomer(customer1);
        customers.addCustomer(customer2);

        GeneralReportVisitor visitor = new GeneralReportVisitor();

        customers.accept(visitor);

        visitor.displayResults();
    }
}
