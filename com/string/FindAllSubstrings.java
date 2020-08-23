package com.string;

public class FindAllSubstrings {

    public static void findSubstrings(String inputStr) {
        char[] charArray = inputStr.toCharArray();
        for(int i =0 ; i < inputStr.length(); i ++) {
            for(int j = i +1 ; j <= inputStr.length(); j++){
                System.out.println(inputStr.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String input = "abcd";
        System.out.println("input:" + input);
        System.out.println("All substrings");
        findSubstrings(input);
    }
}
