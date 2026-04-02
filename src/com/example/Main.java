package com.example;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // boolean result = ValidAnagram.isAnagram("racecar", "carrace");
        int[] nums = new int[]{1,2,4,6};
        // int k = 2;
        // int[] result = TopKFrequentElements.topKFrequent(nums, k);
        // List<String> str = List.of("we","say",":","yes","!@#$%^&*()");
        // String encode = EncodeandDecodeStrings.encode(str);
        // System.out.println(encode); // Output: true
        // List<String> decode = EncodeandDecodeStrings.decode(encode);
        // System.out.println(decode);
       int[] res = ProductsofArrayExceptSelf.productExceptSelf(nums);
       System.out.println(Arrays.toString(res));
    }
}
