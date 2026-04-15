package com.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // boolean result = ValidAnagram.isAnagram("racecar", "carrace");
        int[] nums = new int[] { -1, 0, 1, 2, 3 };
        // int k = 2;
        // int[] result = TopKFrequentElements.topKFrequent(nums, k);
        // List<String> str = List.of("we","say",":","yes","!@#$%^&*()");
        // String encode = EncodeandDecodeStrings.encode(str);
        // System.out.println(encode); // Output: true
        // List<String> decode = EncodeandDecodeStrings.decode(encode);
        // System.out.println(decode);
        int[] res = ProductsofArrayExceptSelf.productExceptSelf3(nums);
        System.out.println(Arrays.toString(res));
        char[][] board = {
                { '1', '2', '.', '.', '3', '.', '.', '.', '.' },
                { '4', '.', '.', '5', '.', '.', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '.', '3' },
                { '5', '.', '.', '.', '6', '.', '.', '.', '4' },
                { '.', '.', '.', '8', '.', '3', '.', '.', '5' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '.', '.', '.', '.', '.', '2', '.', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '8' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        boolean isSudoku = ValidSudoku.isValidSudoku(board);
        System.out.println(isSudoku);
    }
}
