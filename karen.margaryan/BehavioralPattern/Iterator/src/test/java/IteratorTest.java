import designpattern.designpattern.iterator.*;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Karen on 3/13/2015.
 */
public class IteratorTest {

    @Test
    public void test1() {
        IHumanCollection humanCollection = new HumanCollectionImpl();
        humanCollection.addHuman(new Human("Karen", Sex.MALE));
        humanCollection.addHuman(new Human("Petros", Sex.MALE));
        humanCollection.addHuman(new Human("Chutik", Sex.ALL));
        humanCollection.addHuman(new Human("Nanar", Sex.FEMALE));

        IHumanCollection humanCollectionAfterIteration = new HumanCollectionImpl();
        IHumanIterator humanIterator = humanCollection.iterator(Sex.MALE);
        while (humanIterator.hasNext()) {
            humanCollectionAfterIteration.addHuman(humanIterator.next());
        }

        Assert.assertEquals(3, humanCollectionAfterIteration.size());
    }


}
