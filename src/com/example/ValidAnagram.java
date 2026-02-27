package com.example;

import java.util.*;

public class ValidAnagram {
    // public static void main(String[] args) {
    // String s = "anagram";
    // String t = "nagaram";
    // System.out.println(isAnagram(s, t)); // Output: true
    // }

    public static boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            map.put(c1, map.getOrDefault(c1, 0) + 1);
            map.put(c2, map.getOrDefault(c2, 0) - 1);
        }

        for (int value : map.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}