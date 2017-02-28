package Deque;

/**
 * Created by Tony on 27.02.2017.
 */
public interface Deque {
    void pushFront(Object o);
    void pushBack(Object o);
    Object popFront();
    Object popBack();
    Object first();
    Object last();
    int size();
}
