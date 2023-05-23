package com.challenges.leetcode.stack;

class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char ch : s.toCharArray()) {
            if(isOpenChar(ch)) {
                stack.push(ch);
            } else {
                if(stack.isEmpty() || stack.pop() != getOpenChar(ch))
                    return false;
            }
        }
        
        return stack.isEmpty();
    }
    
    public boolean isOpenChar(char ch) {
        return ch == '(' || ch == '[' || ch == '{';
    }
    
    public char getOpenChar(char ch) {
        if(')' == ch)
            return '(';
        if(']' == ch)
            return '[';
        return '{';
    }
}