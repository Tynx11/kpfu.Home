package kpfu.homework.collection.Queue;

/**
 * Created by Tony on 27.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Queue queue = new ArrayQueue(10);
        queue.push(5);
        queue.push(4);
        queue.push(2);
        queue.push(10);
        queue.push(105);
        queue.push(65);
        queue.push(24);
        queue.push(0);

        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();

        System.out.println(queue.first() + " " + queue.size());
    }
}
