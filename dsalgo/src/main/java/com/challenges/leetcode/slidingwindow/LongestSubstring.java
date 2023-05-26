package com.challenges.leetcode.slidingwindow;

/**
 * Problem statement:
 * Given a string s, find the length of the longest substring without repeating characters.
 */
class LongestSubstring {

    /**
     * Using a hashmap to keep track of character seen, as we iterate over the string.
     * When a char is found repeating, shrink the size of the window to remove the previously seen char.
     * thus length of the window gives us the length of the substring without repeating chars
     * @param s
     * @return
     */
    public int lengthOfLongestSubstringV1(String s) {   
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



    /**
     * 
     * Idea is to keep track of indices of seen chars
     * Initially we fix the starting point of the window to 0, i.e. first char
     * when a repeated char is found, window's starting point is updated to its earlier index.
     * @param s
     * @return
     */
    public int lengthOfLongestSubstringV2(String s) {
        int[] indices = new int[256];
        int i = 0, res = 0;

        Arrays.fill(indices, -1);
        for(int j = 0; j < s.length(); j++) {
            int indx = indices[s.charAt(j)];
            i = Math.max(indx + 1, i);
            res = Math.max(res, j - i + 1);
            indices[s.charAt(j)] = j;
        }
        return res;
    }
}