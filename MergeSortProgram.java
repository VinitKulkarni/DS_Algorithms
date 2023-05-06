package com.bridgelabz.algorithmprograms;

import java.util.Arrays;

public class MergeSortProgram {
    public static void mergeSort(String[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(String[] arr, int start, int mid, int end) {
        int leftIndex = start;
        int rightIndex = mid+1;
        int mergedIndex = 0;
        String[] mergedArr = new String[end - start + 1];

        while (leftIndex <= mid && rightIndex <= end) {
            if (arr[leftIndex].compareTo(arr[rightIndex]) <= 0) {
                mergedArr[mergedIndex++] = arr[leftIndex++];
            } else {
                mergedArr[mergedIndex++] = arr[rightIndex++];
            }
        }

        while (leftIndex <= mid) {
            mergedArr[mergedIndex++] = arr[leftIndex++];
        }

        while (rightIndex <= end) {
            mergedArr[mergedIndex++] = arr[rightIndex++];
        }
        System.arraycopy(mergedArr, 0, arr, start, mergedArr.length);
    }

    public static void main(String[] args) {
        String[] arr = {"vinit", "kiran", "rajesh", "gururaj", "mihir"};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
