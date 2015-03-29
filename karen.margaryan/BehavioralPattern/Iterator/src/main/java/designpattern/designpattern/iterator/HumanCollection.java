package designpattern.designpattern.iterator;

/**
 * Created by Karen on 3/13/2015.
 */
public interface HumanCollection {
    public void addHuman(Human human);
    public void removeHuman(Human human);
    public HumanIterator iterator(Sex sex);
    public int size();
}
