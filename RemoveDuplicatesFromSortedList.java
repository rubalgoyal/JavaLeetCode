/* Problem Description
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
Input: head = [1,1,2]
Output: [1,2]
Input: head = [1,1,2,3,3]
Output: [1,2,3]
*/

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

 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp !=null && temp.next != null){
            if(temp.val == temp.next.val)
               temp.next = temp.next.next;
            else
                temp = temp.next;        
        }
        return head; 
    }
}

//Alternate Solution
class Solution {
    LinkedList<Integer> linkedList = new LinkedList();
    public ListNode deleteDuplicates(ListNode head) {
        while(head!=null){
            if(!linkedList.contains(head.val)){
                linkedList.add(head.val);
            }
            head = head.next;
        }  
        ListNode newList = new ListNode();
        ListNode temp = newList;    
        
        for(int val : linkedList){
            temp.next = new ListNode(val);
            temp = temp.next;
         }
            
         
       return newList.next; 
        
    }
}
