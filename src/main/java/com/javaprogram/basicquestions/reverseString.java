package com.javaprogram.basicquestions;

public class reverseString {
    public static void main(String[] args) {
        String s ="Stephin Philip Abraham";
        String [] arr= s.split(" ");
        for(int i =arr.length-1; i>=0;i--){
//            System.out.print(arr[i]+" ");
            String word = arr[i];
            StringBuilder reverseword = new StringBuilder(word);
            System.out.print(reverseword.reverse()+" ");
        }
    }
}
