package com.synisys.training.patterns.behavioral.interpreter;

import com.synisys.training.patterns.behavioral.interpreter.context.DataContext;
import com.synisys.training.patterns.behavioral.interpreter.expression.Expression;
import com.synisys.training.patterns.behavioral.interpreter.expression.nonterminal.NonTerminalExpression;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Anania.Mikaelyan
 * @since 12/19/2014
 */
public class Client {
    @Before
    public void prepare(){

    }

    @Test
    public void test(){
        DataContext context = new DataContext();
        Expression expression = new NonTerminalExpression("Title : Project1 or Organisation : Org2");
        Assert.assertEquals(2, expression.interpret(context).size());
    }
}
