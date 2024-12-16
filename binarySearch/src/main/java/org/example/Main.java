package org.example;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Arrays.sort

        byte[] byteArray = {1, 3, 5, 7, 9};
        System.out.println(Arrays.binarySearch(byteArray, (byte) 5));

        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(Arrays.binarySearch(charArray, 'c'));

        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println(Arrays.binarySearch(doubleArray, 5.5));

        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        System.out.println(Arrays.binarySearch(floatArray, 5.5f));

        Integer[] intArray = {10, 20, 30, 40, 50};
        System.out.println(Arrays.binarySearch(intArray, 30, Comparator.naturalOrder()));

        long[] longArray = {1L, 2L, 3L, 4L, 5L};
        System.out.println(Arrays.binarySearch(longArray, 5L));

        short[] shortArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.binarySearch(shortArray, (short) 5));

        Integer[] intArrayC = {10, 20, 30, 40, 50};
        System.out.println(Arrays.binarySearch(intArrayC, 30, Comparator.naturalOrder()));
        System.out.println(Arrays.binarySearch(intArrayC, 30, Comparator.reverseOrder()));

        //Collections.sort

        List<Integer> list = List.of(10, 20, 30, 40, 50);
        int index1 = Collections.binarySearch(list, 30); //2
        System.out.println("Index of 30: " + index1);

    }
}
