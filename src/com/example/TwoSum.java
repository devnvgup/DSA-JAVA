package com.example;

import java.util.HashMap;
import java.util.Map;

// nums = [3,4,5,6], target = 7

// Output: [0,1]

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                return new int[] { map.get(nums[i]), i };
            }
            int key = target - nums[i];
            map.put(key, i);
            System.out.println(key);
        }
        return new int[] {};
    }
}