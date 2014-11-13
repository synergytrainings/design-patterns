package com.synisys.training.patterns.structural.adapter;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Test for Classifier converter as Client of Adapter-Wrapper pattern
 * @author Anania.Mikaelyan
 * @since 11/13/2014
 */
public class ClassifierConverterTest {
    @Test
    public void testClassifierConverter() throws Exception {
        Contact someContact = new Contact(1l, "Murph", "Copper");
        Classifier alreadyClassifierContact = new ContactClassifier(someContact);
        Classifier someSector = new ClassifierImpl(1l, "Science");

        List<Classifier> classifierList = new ArrayList<>(2);
        classifierList.add(alreadyClassifierContact);
        classifierList.add(someSector);

        ClassifierConverter converter = new ClassifierConverter(classifierList);

        Assert.assertEquals("Science", converter.getAsString(someSector));
        Assert.assertEquals("Murph Copper", converter.getAsString(alreadyClassifierContact));
    }
}
