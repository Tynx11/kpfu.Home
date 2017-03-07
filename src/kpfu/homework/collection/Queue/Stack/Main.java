package kpfu.homework.collection.Queue.Stack;

/**
 * Created by Tony on 20.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        List ml = new List();
        ml.addBack(1.0);
        ml.addBack(2);
        ml.addBack("brrr");
        ml.addFront(6);

        ml.printList();
        System.out.println();
        System.out.println(ml.getElement(3));
    }
}

