package com.challenges.leetcode.slidingwindow;

class MinSizeSubarraySum {

    /**
     * Brute-force approach is to find all possible subarrays and their sum
     * then pick with the subarrays with sum greater than or equal to target
     * choose the min size subarray as the answer.
     * 
     * However, it is going to be expensive in terms of time complexity.
     * 
     * It is possible that we compute the same sum more than once.
     * for example, by computing the sum of subarray [1  2   3   4], 
     * we're again computing the sum of subarray [1   2   3].
     * 
     * To avoid doing this we can keep on increasing size of subarray until the sum >= target,
     * then to see if it can be minimized by shrinking the subarray from the left end.
     * 
     * The min window that satisfies the condition sum >= target will be the answer.
     */
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int res = Integer.MAX_VALUE, sum = 0;

        for(right = 0; right < nums.length; right++) {
            sum += nums[right];
            while(sum >= target) {
                res = Math.min(res, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return res != Integer.MAX_VALUE ? res : 0;
    }
}