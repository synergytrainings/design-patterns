package designpattern.designpattern.iterator;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Karen on 3/13/2015.
 */
public class HumanCollectionImpl implements HumanCollection {

    private List<Human> humansList;

    public HumanCollectionImpl() {
        humansList = new LinkedList<Human>();
    }

    public void addHuman(Human human) {
        humansList.add(human);
    }

    public void removeHuman(Human human) {
        humansList.remove(human);
    }

    public int size() {
        return humansList.size();
    }

    @Override
    public HumanIterator iterator(Sex sex) {
        return new HumanIteratorImpl(sex);
    }


    private class HumanIteratorImpl implements HumanIterator {

        private Sex sex;
        private int currentPosition;

        public HumanIteratorImpl(Sex sex) {
            this.sex = sex;
        }

        @Override
        public boolean hasNext() {
            while (currentPosition < humansList.size()) {
                Human human = humansList.get(currentPosition);
                if (human.getSex() == Sex.BOTH || human.getSex() == sex) {
                    return true;
                }
                ++currentPosition;
            }
            return false;
        }

        @Override
        public Human next() {
            Human human = humansList.get(currentPosition);
            ++currentPosition;
            return human;
        }
    }
}
