package com.string;

import java.util.HashMap;
import java.util.Map;

/*
    for a given string of length 4 (ABCD) -> total permutations are 4!
    and if any letter is repeating then divide the above by the factorial of the number of occurences of that letter.
    For example - for string AABC -> number of possible per mutations are 4! / 2! = 12
   Time complexity : n!
   space complexity : length of array for storing any one given combination - so (n).
 */

public class StringPermutations {

    public static void main(String[] args) {

        permute("abc");
    }

    public static void permute(String inputStr) {
        char[] input = inputStr.toCharArray();
        Map<Character, Integer> countMap = new HashMap<>();
        for (int i =0; i < input.length; i++) {
            countMap.put(input[i], countMap.getOrDefault(input[i], 0) + 1);
        }
        char[] str = new char[countMap.size()];
        int[] count = new int[countMap.size()];
        char[] result = new char[input.length];
        int index = 0;
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            str[index] = entry.getKey();
            count[index] = entry.getValue();
            index++;
        }
        permuteUtil(str, count, result, 0);
    }

    public static void permuteUtil(char[] str, int[] count, char[] result, int level) {

        if(level == result.length) {
            printArray(result);
            return;
        }

        for(int i =0; i <str.length; i++) {
            if (count[i] == 0) {
                continue;
            }
            result[level] = str[i];
            count[i]--;
            permuteUtil(str, count, result, level + 1);
            count[i]++;
        }
    }

    public static void printArray(char[] result) {
        for(int i=0; i <result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();
    }

}
