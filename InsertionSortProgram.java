package com.bridgelabz.algorithmprograms;

import java.util.Arrays;

public class InsertionSortProgram {

    public static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        String[] arr = {"samsung", "apple", "nokia", "oneplus", "redmi"};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
