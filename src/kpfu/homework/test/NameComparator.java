package kpfu.homework.test;

import java.util.Comparator;

/**
 * Created by Tony on 23.03.2017.
 */
public class NameComparator implements Comparator<Obj> {
    @Override
    public int compare(Obj o1, Obj o2) {
        return o1.name.compareTo(o2.name);
    }
}
