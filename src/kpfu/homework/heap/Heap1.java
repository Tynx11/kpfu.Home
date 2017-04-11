package kpfu.homework.heap;

import java.util.ArrayList;

/**
 * Created by Tony on 10.04.2017.
 */
public class Heap1<T extends Comparable<T>> {
    private ArrayList<T> heapArray = new ArrayList<>();

    public Heap1() {

    }

    public Heap1(T[] objects) {
        for (T object : objects) {
            add(object);
        }
    }

    public void add(T obj) {
        heapArray.add(obj);
        int currentIndex = heapArray.size() - 1;

        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;

            if (heapArray.get(currentIndex).compareTo(heapArray.get(parentIndex)) > 0) {
                T temp = heapArray.get(currentIndex);
                heapArray.set(currentIndex, heapArray.get(parentIndex));
                heapArray.set(parentIndex, temp);
            } else
                break;

            currentIndex = parentIndex;
        }

    }

    public T remove() {
        if (heapArray.isEmpty()) {
            return null;
        }
        T removeObj = heapArray.get(0);
        heapArray.set(0, heapArray.get(heapArray.size() - 1));
        heapArray.remove(heapArray.size() - 1);

        int currentIndex = 0;
        while (currentIndex < heapArray.size()) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;

            if (leftChildIndex >= heapArray.size()) {
                break;
            }
            int maxIndex = leftChildIndex;

            if (rightChildIndex < heapArray.size()) {
                if (heapArray.get(maxIndex).compareTo(heapArray.get(rightChildIndex)) < 0) {
                    maxIndex = rightChildIndex;
                }
            }
            if (heapArray.get(currentIndex).compareTo(heapArray.get(maxIndex)) < 0) {
                T temp = heapArray.get(maxIndex);
                heapArray.set(maxIndex, heapArray.get(currentIndex));
                heapArray.set(currentIndex, temp);
                currentIndex = maxIndex;
            } else {
                break;
            }
        }
        return removeObj;
    }
    public int getSize() {
        return heapArray.size();
    }

}

