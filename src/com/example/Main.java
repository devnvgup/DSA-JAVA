package com.example;

public class Main {
    public static void main(String[] args) {
    //    boolean result = ValidAnagram.isAnagram("racecar", "carrace");
       int[] nums = new int[]{1,2,2,3,3,3};
       int k = 2;
       int[] result = TopKFrequentElements.topKFrequent(nums, k);
       System.out.println(result); // Output: true
    }
}
