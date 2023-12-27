/*
Problem Statement:

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
*/

import java.math.BigInteger;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder list1 = new StringBuilder();
        StringBuilder list2 = new StringBuilder();
        while(l1 != null || l2 != null){
            if(l1 != null){
                list1.insert(0, String.valueOf(l1.val));
                l1 = l1.next;

            }
            if( l2 != null){
                list2.insert(0, String.valueOf(l2.val));
                l2 = l2.next;

            }
            
        }

        BigInteger sum = new BigInteger(list1.toString()).add(new BigInteger(list2.toString()));
        String sum2 = String.valueOf(sum);
        ListNode twoNumbers = new ListNode();
        ListNode temp = twoNumbers;
        
        for(int i = sum2.length() - 1; i >= 0; i--){
            int digit = Character.getNumericValue(sum2.charAt(i));
            temp.next = new ListNode(digit);
            temp = temp.next;
      
        }

        return twoNumbers.next;
    }
}

// Alternate Approach

import java.math.BigInteger;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode twoNumbers = new ListNode();
        ListNode temp = twoNumbers;
        int carryOver = 0;
        while(l1 != null || l2 != null || carryOver > 0){
            if(l1 != null){
                carryOver += l1.val;
                l1 = l1.next;
            }
            if( l2 != null){
                carryOver += l2.val;
                l2 = l2.next;
            }  
            temp.next = new ListNode(carryOver % 10);
            temp = temp.next;
            carryOver = carryOver / 10;
        }
        return twoNumbers.next;
    }
}

