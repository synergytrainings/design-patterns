import designpattern.designpattern.iterator.*;

/**
 * Created by Karen on 3/12/2015.
 */
public class Main {
    public static void main(String ... args) {
        HumanCollection humanCollection = new HumanCollectionImpl();
        humanCollection.addHuman(new Human("Karen", Sex.MALE));
        humanCollection.addHuman(new Human("Petros", Sex.MALE));
        humanCollection.addHuman(new Human("Chutik", Sex.BOTH));
        humanCollection.addHuman(new Human("Nanar", Sex.FEMALE));

        HumanIterator humanIterator = humanCollection.iterator(Sex.MALE);
        while (humanIterator.hasNext()) {
            Human human = humanIterator.next();
            System.out.println(human.toString());
        }


    }
}
