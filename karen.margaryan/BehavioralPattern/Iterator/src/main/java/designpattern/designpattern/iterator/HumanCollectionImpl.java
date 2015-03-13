package designpattern.designpattern.iterator;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Karen on 3/13/2015.
 */
public class HumanCollectionImpl implements IHumanCollection {

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
    public IHumanIterator iterator(Sex sex) {
        return new HumanIteratorImpl(sex, humansList);
    }


    private class HumanIteratorImpl implements IHumanIterator {

        private Sex sex;
        private List<Human> humansList;
        private int currentPosition;

        public HumanIteratorImpl(Sex sex, List<Human> humansList) {
            this.sex = sex;
            this.humansList = humansList;
        }

        @Override
        public boolean hasNext() {
            while (currentPosition < humansList.size()) {
                Human human = humansList.get(currentPosition);
                if (human.getSex() == Sex.ALL || human.getSex() == sex) {
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
