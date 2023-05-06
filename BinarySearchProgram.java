package com.bridgelabz.algorithmprograms;

import java.util.Arrays;

//2. Binary Search the Word from Word List:
public class BinarySearchProgram {
    public static int binarySearch(String[] words, String searchWord) {
        int left = 0;
        int right = words.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = searchWord.compareTo(words[mid]);
            if (compare == 0) {
                return mid;
            } else if (compare < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] words = {"good", "morning", "to", "all", "family", "members"};
        Arrays.sort(words);
        String searchWord = "family";
        int result = binarySearch(words, searchWord);
        if (result == -1) {
            System.out.println(searchWord + " not found in the word list.");
        } else {
            System.out.println(searchWord + " found at index " + result + " in the word list.");
        }
    }
}
