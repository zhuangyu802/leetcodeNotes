package com.dwj.leetcode.leetcode.editor.cn;

class Solution {

    /**
     * 26. 删除排序数组中的重复项
     * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     * <p>
     * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
     *
     * @param nums
     * @return
     */
    int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int differIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[differIndex]) {
                continue;
            }
            nums[++differIndex] = nums[i];
        }
        return differIndex + 1;
    }

    /**
     * 盛最多水的容器
     * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，
     * 垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     * <p>
     * 说明：你不能倾斜容器，且 n 的值至少为 2。
     * 示例：
     * 输入: [1,8,6,2,5,4,8,3,7]
     * 输出: 49
     *
     * @param height
     * @return
     */
    int maxArea(int[] height) {
        // 两边收敛
        int maxArea = 0;
        int left = 0, right = height.length - 1, with, high, area;
        for (int i = 0; i < height.length; i++) {
            with = right - left;
            high = height[left] > height[right] ? height[right] : height[left];
            area = with * high;
            maxArea = maxArea >= area ? maxArea : area;
            if (left == right) {
                return maxArea;
            }
            if (high == height[left]) {
                left++;
                continue;
            }
            right--;
        }
        return maxArea;
    }

    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     * <p>
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     * <p>
     * 注意：给定 n 是一个正整数。
     * 示例1：
     * 输入： 2
     * 输出： 2
     * 解释： 有两种方法可以爬到楼顶。
     * 1.  1 阶 + 1 阶
     * 2.  2 阶
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
