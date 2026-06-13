package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        // Input: nums = [-1,0,1,2,-1,-4]
        // Output: [[-1,-1,2],[-1,0,1]]
        // sort
        // -4 -1 -1 0 1 2
        // 0 0 0 0
        // -2 -2 0 1 2 3
        Arrays.sort(nums);
        // -4 -1 -1 0 1 2
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> tmp = new ArrayList<Integer>();
                    Collections.addAll(tmp, nums[i], nums[j], nums[k]);
                    result.add(tmp);
                    while (nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (nums[k] == nums[k - 1]) {
                        k--;
                    }
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return result;
    }
}
