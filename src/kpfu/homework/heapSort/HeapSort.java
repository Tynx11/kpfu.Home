package kpfu.homework.heapSort;

import java.util.List;

/**
 * Created by Tony on 4.03.2017.
 */

import java.util.Arrays;
import java.util.Scanner;



public class HeapSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }





        HeapUtl.sort(array);
        System.out.println(Arrays.toString(array));

    }

}


