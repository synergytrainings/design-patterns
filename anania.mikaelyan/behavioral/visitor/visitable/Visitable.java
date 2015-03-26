package com.synisys.training.patterns.behavioral.visitor.visitable;

import com.synisys.training.patterns.behavioral.visitor.visitor.Visitor;

/**
 * @author Anania.Mikaelyan
 * @since 3/27/2015
 */
public interface Visitable {
    public void accept(Visitor visitor);
}
