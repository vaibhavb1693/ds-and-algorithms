package com.string;

public class ReverseString {

    public static String reverseStringIterative(String inputStr) {
        char[] charArray = inputStr.toCharArray();
        for(int i =0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        return String.valueOf(charArray);
    }

    public static String reverseStringRecursive(String inputStr) {
        if(inputStr.length() < 2) {
            return inputStr;
        }
        return reverseStringRecursive(inputStr.substring(1)) + inputStr.substring(0,1);
    }

    public static void main(String[] args) {
        String input = "juggernaut";
        System.out.println("input:" + input);
        System.out.println("Iterative reverse");
        System.out.println(reverseStringIterative(input));
        System.out.println("Recursive reverse");
        System.out.println(reverseStringRecursive(input));
    }
}
