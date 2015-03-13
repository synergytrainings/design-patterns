package api;

public interface Tree<E> {

    E getRoot();

    TreeIterator<E> getIterator();

}
