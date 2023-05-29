package com.challenges.leetcode.linkedlist;

class IntersectionOfLists {

    /**
     * Brute-force approach : each node in ListA is compared with each node in ListB
     * Time complexity : O(m * n)
     * Space complexity : O(1)
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headA != null) {
            ListNode temp = headB;
            while(temp != null) {
                if(temp == headA)
                    return headA;
                temp = temp.next;
            }
            headA = headA.next;
        }
        return null;
    }
}