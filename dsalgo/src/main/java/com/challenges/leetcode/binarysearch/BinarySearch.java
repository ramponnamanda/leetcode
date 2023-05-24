package com.challenges.leetcode.binarysearch;

class Solution {

    /**
     * classic binary search
     */
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        int mid, res = -1;

        while(lo <= hi) {
            mid = (lo + hi) >> 1;

            if(nums[mid] == target) {
                res = mid;
                break;
            }

            if(nums[mid] < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }

        return res;
    }
}