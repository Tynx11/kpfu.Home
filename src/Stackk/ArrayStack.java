package Stackk;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tony on 27.02.2017.
 */

    public class ArrayStack implements Stack {
        private List data;

        public ArrayStack(int capasity) {
            data = new ArrayList(capasity);
        }

        @Override
        public void push(Object o) {
            data.add(o);
        }

        @Override
        public Object top() {
            return data.get(size() - 1);
        }

        @Override
        public Object pop() {
            Object o = top();
            data.remove(data.size() - 1);
            return o;
        }

        @Override
        public int size() {
            return data.size();
        }

        @Override
        public boolean isEmpty() {
            return size() == 0;
        }
    }


