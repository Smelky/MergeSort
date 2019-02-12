package com.smelk;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arrayForSort = {7, 4, 8, 3, 10, 15, 1, 15, 10, 25};

        System.out.println(Arrays.toString(arrayForSort));

        mergeSort(arrayForSort, arrayForSort.length);

        System.out.println(Arrays.toString(arrayForSort));

    }

    public static void mergeSort(int[] arrayForSort, int arrayForSortLength) {
        if (arrayForSortLength < 2) {
            return;
        }
        int midOfArray = arrayForSortLength / 2;
        int[] firstHalf = new int[midOfArray];
        int[] secondHalf = new int[arrayForSortLength - midOfArray];

        for (int i = 0; i < midOfArray; i++) {
            firstHalf[i] = arrayForSort[i];
        }
        for (int i = midOfArray; i < arrayForSortLength; i++) {
            secondHalf[i - midOfArray] = arrayForSort[i];
        }
        mergeSort(firstHalf, midOfArray);

        mergeSort(secondHalf, arrayForSortLength - midOfArray);

        merge(arrayForSort, firstHalf, secondHalf, midOfArray, arrayForSortLength - midOfArray);

    }

    public static void merge(int[] arrayForSort, int[] firstHalf, int[] secondHalf, int midOfArray, int secondHslfOfArray) {

        int i = 0, j = 0, k = 0;
        while (i < midOfArray && j < secondHslfOfArray) {
            if (firstHalf[i] <= secondHalf[j]) {
                arrayForSort[k++] = firstHalf[i++];
            } else {
                arrayForSort[k++] = secondHalf[j++];
            }
        }
        while (i < midOfArray) {
            arrayForSort[k++] = firstHalf[i++];
        }
        while (j < secondHslfOfArray) {
            arrayForSort[k++] = secondHalf[j++];
        }
    }
}