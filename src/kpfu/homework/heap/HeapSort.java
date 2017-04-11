package kpfu.homework.heap;

/**
 * Created by Tony on 10.04.2017.
 */
    public class HeapSort {

        public static <T extends Comparable<T>> void heapSort(T[] list) {

            Heap1<T> heap = new Heap1<>();

            for (T list1 : list) {
                heap.add(list1);
            }

            for (int i = list.length - 1; i >= 0; i--) {
                list[i] = heap.remove();
            }

        }

        public static void main(String[] args) {

            Integer[] Test1 = {9, 7, 6, 3, 4, 6, 5, 1, 2, 3};
            heapSort(Test1);

            for (Integer Test11 : Test1) {
                System.out.print(Test11 + " ");
            }

            System.out.println();

            Character[] Test2 = {'L', 'F', 'G', 'S', 'V', 'B', 'S', 'M', 'H', 'T'};
            heapSort(Test2);

            for (Character Test21 : Test2) {
                System.out.print(Test21 + " ");
            }

        }
    }
