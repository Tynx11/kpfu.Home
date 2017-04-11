package kpfu.homework.test;

import java.util.Comparator;

/**
 * Created by Tony on 23.03.2017.
 */
public class PointsComparator implements Comparator<Obj> {

    @Override
    public int compare(Obj o1, Obj o2) {
        return o1.points - o2.points;
    }
}
