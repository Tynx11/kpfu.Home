package Queue;

/**
 * Created by Tony on 27.02.2017.
 */
public interface Queue {
    void push(Object o);
    Object first();
    Object pop();
    int size();
    boolean isEmty();
}

