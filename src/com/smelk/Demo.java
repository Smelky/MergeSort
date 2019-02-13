package com.smelk;

import static com.smelk.MergeSortInPlace.*;

public class Demo {

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int arr_size = arr.length;

        mergeSort(arr, 0, arr_size - 1);
        printArray(arr, arr_size);
    }
}
