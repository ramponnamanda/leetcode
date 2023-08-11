package com.challenges.leetcode.twopointer;

/**
 * 125. Valid Palindrome
 */
class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        char[] ch = s.toCharArray();
        boolean result = true;

        while(left < right) {
            if(!Character.isLetterOrDigit(ch[left])) {
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(ch[right])) {
                right--;
                continue;
            }
            if(Character.toLowerCase(ch[left]) != Character.toLowerCase(ch[right])) {
                result = false;
                break;
            }
            left++;
            right--;
        }
        return result;
    }
}