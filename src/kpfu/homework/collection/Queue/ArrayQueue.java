package kpfu.homework.collection.Queue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tony on 27.02.2017.
 */
public class ArrayQueue implements Queue {
    private List queue;
    private int capasity;

    public ArrayQueue(int capasity) {
        queue = new ArrayList(capasity);
    }

    @Override
    public void push(Object o) {
        queue.add(o);
    }

    @Override
    public Object first() {
        return queue.get(0);
    }

    @Override
    public Object pop() {
        Object temp = first();
        queue.remove(0);
        return temp;
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmty() {
        return size() == 0;
    }
}

