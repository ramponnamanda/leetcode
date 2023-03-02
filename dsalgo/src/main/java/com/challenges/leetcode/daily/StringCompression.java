package com.challenges.leetcode.daily;

/*
 * https://leetcode.com/problems/string-compression/
 */

class StringCompression {
    public int compress(char[] chars) {

        if(chars.length == 1)
            return 1;

        int res = 0, i = 0, count = 1;
        while(i < chars.length) {
            count = 1;
            while(i + count < chars.length && chars[i + count] == chars[i]) {
                ++count;
            }

            chars[res++] = chars[i];
            if(count > 1) {
                for(char ch : Integer.toString(count).toCharArray()) {
                    chars[res++] = ch;
                }
            }
            i += count;
        }

        return res;
        
    }
}