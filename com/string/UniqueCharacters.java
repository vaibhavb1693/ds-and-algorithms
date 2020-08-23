package com.string;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

    public static boolean findIfUnique(String inputStr) {
        char[] charArray = inputStr.toCharArray();
        Set<Character> set = new HashSet<>();
        for(int i =0; i < charArray.length; i++) {
            if(!set.add(charArray[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "juggernaut";
        System.out.println("input:" + input);
        System.out.println("Are all characters unique ??");
        System.out.println(findIfUnique(input));
    }
}
