package com.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatCharacter {

    //using Map and traversing string twice
    public static String firstNonRepeatingCharacter1(String inputStr) {
        if(inputStr == null || inputStr.isEmpty()) {
            return "No non repeating character";
        }
        Map<Character,Integer> characterCounts = new HashMap<>();
        char[] charArray = inputStr.toCharArray();
        for(int i =0; i < charArray.length; i++) {
            characterCounts.put(charArray[i],characterCounts.getOrDefault(charArray[i], 0) + 1);
        }
        for(int i =0; i < charArray.length; i++) {
            if (characterCounts.get(charArray[i]) == 1) {
                return String.valueOf(charArray[i]);
            }
        }
        return "No non repeating character";
    }

    //using LinkedHashMap and traversing string once
    public static String firstNonRepeatingCharacter2(String inputStr) {
        if(inputStr == null || inputStr.isEmpty()) {
            return "No non repeating character";
        }
        Map<Character,Integer> characterCounts = new LinkedHashMap<>();
        char[] charArray = inputStr.toCharArray();
        for(int i =0; i < charArray.length; i++) {
            characterCounts.put(charArray[i],characterCounts.getOrDefault(charArray[i], 0) + 1);
        }
        for(Map.Entry<Character,Integer> entry : characterCounts.entrySet()) {
            if(entry.getValue() == 1) {
                return String.valueOf(entry.getKey());
            }
        }
        return "No non repeating character";
    }

    //using custom data structure and Map
    static class CountIndex {
        int count;
        int index;
        public CountIndex(int index) {
            this.count = 1;
            this.index = index;
        }

        public void incCount() {
            this.count++;
        }
    }
    public static String firstNonRepeatingCharacter3(String inputStr) {
        if(inputStr == null || inputStr.isEmpty()) {
            return "No non repeating character";
        }
        Map<Character, CountIndex> characterIndexMap = new HashMap<>();
        char[] charArray = inputStr.toCharArray();
        for(int i =0; i < charArray.length; i++) {
            if(characterIndexMap.containsKey(charArray[i])) {
                characterIndexMap.get(charArray[i]).incCount();
            }else {
                characterIndexMap.put(charArray[i], new CountIndex(i));
            }
        }

        int firstIndex = Integer.MAX_VALUE;
        for(Map.Entry<Character,CountIndex> entry : characterIndexMap.entrySet()) {
            if (entry.getValue().count == 1 && entry.getValue().index < firstIndex) {
                firstIndex = entry.getValue().index;
            }
        }
        return firstIndex == Integer.MAX_VALUE ?  "No non repeating character" : String.valueOf(charArray[firstIndex]);
    }

    public static void main(String[] args) {
        String input = "";
        System.out.println("input:" + input);
        System.out.println("First Non repeat character");
        System.out.println(firstNonRepeatingCharacter3(input));
    }
}
