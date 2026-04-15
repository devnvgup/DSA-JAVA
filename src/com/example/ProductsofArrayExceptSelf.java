package com.example;

import java.util.Stack;

public class ProductsofArrayExceptSelf {
    // Input: nums = [1,2,4,6]

    // Output: [48,24,12,8]

    // Input: nums = [-1,0,1,2,3]

    // Output: [0,-6,0,0,0]

    // create arr to save [1] , then 2x4x6
    // arr.pop() then push [2], then 1x4x6
    // arr.pop() then push [4].....

    // O(n)
    // solution 1: brute force
    // Solution 2:
    public static int[] productExceptSelf2(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int result = 1;
            while (j <= nums.length - 1) {
                result *= nums[j];
                j++;
            }
            for (Integer item : stack) {
                result *= item;
            }
            stack.push(nums[i]);
            res[i] = result;
        }
        return res;
    }

    // solution 3: Division
    public static int[] productExceptSelf3(int[] nums) {
        int countZero = 0;
        int totalProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                // caculate zero
                countZero++;
            } else {
                // caculate total product except zero value
                totalProduct *= nums[i];
            }
        }
        int[] res = new int[nums.length];
        if (countZero > 1) {
            return new int[nums.length];
        } else if (countZero == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    res[i] = 0;
                } else {
                    res[i] = totalProduct;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                res[i] = totalProduct / nums[i];
            }
        }
        return res;
    }

    // solution 4 : Prefix & Suffix
    public static int[] productExceptSelf4(int[] nums) {
        int[] res = new int[nums.length];
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= nums[i];
        }
        return res;
    }
}
