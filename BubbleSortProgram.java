package com.bridgelabz.algorithmprograms;

import java.util.Arrays;

//bubble sort using integer array
public class BubbleSortProgram {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 13, 7, 1, 9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
