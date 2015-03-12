package com.synisys.training.patterns.behavioral.iterator;

import com.synisys.training.patterns.behavioral.iterator.aggregate.NameAggregate;
import com.synisys.training.patterns.behavioral.iterator.iterator.NameIterator;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Anania.Mikaelyan
 * @since 3/13/2015
 */
public class Client {
    @Test
    public void test(){

        NameAggregate aggregate = new NameAggregate(new String[]{"Nora" , "Vali" ,"Martiror" , "Lora"});
        NameIterator iterator = aggregate.getIterator();
        Assert.assertEquals("Nora",iterator.next());
        Assert.assertEquals("Vali", iterator.next());
        iterator.next();
        Assert.assertEquals("Lora", iterator.next());

        //get will return the iterator with initial state
        Assert.assertEquals("Nora",aggregate.getIterator().next());
        Assert.assertEquals("Nora", aggregate.getIterator().next());


    }

}
