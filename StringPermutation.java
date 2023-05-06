package com.bridgelabz.algorithmprograms;

public class StringPermutation {
    static void permutation(String find, String search){
        if(search.length() == 0){
            System.out.println(find);
        }
        for(int i=0; i<search.length(); i++){
            String ch = find + search.charAt(i);
            String strVar = search.substring(0,i) + search.substring(i+1);
            permutation(ch,strVar);
        }

    }

    public static void main(String[] args) {
        String str = "abcd";
        permutation(" ",str);
    }
}
