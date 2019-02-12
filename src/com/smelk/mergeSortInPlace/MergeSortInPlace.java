package com.smelk.mergeSortInPlace;

import java.util.Arrays;

public class MergeSortInPlace {

    public static void main(String[] args) {

        int[] array = {5, 4, 2, 8, 19, 43, 5, 22, 88, 1, 3};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {

        int i = 0;
        while (i < array.length) {
            msort(array, i);
            i++;
        }
    }

    public static void msort(int[] array, int i) {
        int j = 0;
        j = j + i;

        while (j < array.length) {
            if (array[i] > array[j]) {

                array[i] = array[i] + array[j];
                array[j] = array[i] - array[j];
                array[i] = array[i] - array[j];
            }
            j++;
        }
    }
}
