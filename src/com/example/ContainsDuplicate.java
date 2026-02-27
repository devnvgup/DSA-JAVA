package com.example;


import java.util.HashSet;
import java.util.Set;

// Solution 1 : Using HashSet to check for duplicates in the array
public class ContainsDuplicate {
    // public static void main(String[] args) {
    //     int[] nums = { 1, 2, 3, 1 };
    //     System.out.println(containsDuplicate(nums)); // Output: true
    // }

    public  static  boolean  containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

// Solution 2 : use map

// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         Map<Integer, String> map = new HashMap<>();
//         for (Integer i: nums){
//             if(map.containsKey(i)){
//                 return true;
//             }
//             map.put(i,"added");
//         }
//         return false;
//     }
// }
