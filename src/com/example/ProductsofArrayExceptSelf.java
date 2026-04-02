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
    public static int[] productExceptSelf(int[] nums) {
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
}
