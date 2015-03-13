package api;

/**
 * Iterator for tree like structures.
 */
public interface TreeIterator<E> {

    boolean hasNext();

    E next();
}
