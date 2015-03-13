package designpattern.designpattern.iterator;

/**
 * Created by Karen on 3/13/2015.
 */
public interface IHumanCollection {
    public void addHuman(Human human);
    public void removeHuman(Human human);
    public IHumanIterator iterator(Sex sex);
    public int size();
}
