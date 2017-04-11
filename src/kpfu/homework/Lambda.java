package kpfu.homework;

import java.util.*;

/**
 * Created by Tony on 29.03.2017.
 */
public class Lambda {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("qwe");
        arr.add("asdasd");
        arr.add("bsdasdsad");
        arr.add("sadsaasd");

//        Comparator<String> comp = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return (Integer.compare(o1.length(), o2.length()) * -1);
//            }
//
//            @Override
//            public boolean equals(Object obj) {
//                return (true);
//            }
//        };

        Collections.sort(arr,
                ((o1, o2) -> Integer.compare(o1.length(),o2.length())) );
        System.out.println(arr);

    }
}
