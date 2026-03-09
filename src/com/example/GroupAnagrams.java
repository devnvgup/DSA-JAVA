package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> newStrs = new ArrayList<>();
        for (String i: strs) {
            char[] chars = i.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            newStrs.add(sorted);
        }
        List<Integer> visited = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        for (Integer i = 0; i < newStrs.size(); i++) {
            if (visited.contains(i)){
                continue;
            }
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            for (Integer j =  i+1;j < newStrs.size(); j++) {
                
                if (newStrs.get(i).equals(newStrs.get(j))){
                    list.add(strs[j]);
                    visited.add(j);
                }
            }
            result.add(list);
        }

        return result;
    }
}
