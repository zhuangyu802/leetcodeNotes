package com.dwj.leetcode.leetcode.editor.cn;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] height = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Solution solution = new Solution();
        System.out.print("maxArea== " + solution.maxArea(height));
        System.out.print("removeDuplicates== " + solution.removeDuplicates(height));

    }
}
