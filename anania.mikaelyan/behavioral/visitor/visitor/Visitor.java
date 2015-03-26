package com.synisys.training.patterns.behavioral.visitor.visitor;

import com.synisys.training.patterns.behavioral.visitor.visitable.Customer;
import com.synisys.training.patterns.behavioral.visitor.visitable.Item;
import com.synisys.training.patterns.behavioral.visitor.visitable.Order;

/**
 * @author Anania.Mikaelyan
 * @since 3/27/2015
 */
public interface Visitor {
    public void visit(Customer customer);

    public void visit(Order order);

    public void visit(Item item);
}
