package com.challenges.leetcode.slidingwindow;

/**
 * Problem statement:
 * Given a string s, find the length of the longest substring without repeating characters.
 */
class Solution {

    /**
     * Using a hashmap to keep track of character seen, as we iterate over the string.
     * When a char is found repeating, shrink the size of the window to remove the previously seen char.
     * thus length of the window gives us the length of the substring without repeating chars
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {   
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, res = 0;
        for(right = 0; right < s.length(); right++) {
            int count = map.getOrDefault(s.charAt(right), 0);
            while(count > 0) {
                int chCount = map.get(s.charAt(left));
                map.put(s.charAt(left), --chCount);
                if(s.charAt(left) == s.charAt(right))
                    count--;
                left++;
            }
            map.put(s.charAt(right), 1);
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}