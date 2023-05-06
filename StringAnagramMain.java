package com.bridgelabz.algorithmprograms;

import java.util.Arrays;

public class StringAnagramMain {

    static boolean isLengthEqual(String str1, String str2){
        if(str1.length() == str2.length())
            return true;
        else
            return false;
    }

    static void isAnagram(String newStr1, String newStr2){
        System.out.println();
        if(newStr1.equals(newStr2)){
            System.out.println("both strings are anagram");
        }else{
            System.out.println("!! strings are not anagram !!");
        }
    }

    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heapt";
        char charArray1[] = new char[str1.length()];
        char charArray2[] = new char[str2.length()];
        int strLength = str1.length();


        if(isLengthEqual(str1,str2)){
            for(int i=0; i<strLength; i++){
                charArray1[i] = str1.charAt(i);
                charArray2[i] = str2.charAt(i);
            }
        }else{
            System.out.println("String are not of same length. Strings are not Anagram");
            System.exit(100);
        }


        String newStr1 = "";
        String newStr2 = "";
        Arrays.sort(charArray1);
        for(int i=0; i<strLength; i++){
            System.out.print(charArray1[i] + " ");
            newStr1 = newStr1 + charArray1[i];
        }
        System.out.println();
        Arrays.sort(charArray2);
        for(int i=0; i<strLength; i++){
            System.out.print(charArray2[i] + " ");
            newStr2 = newStr2 + charArray2[i];
        }

        isAnagram(newStr1,newStr2);
    }
}
