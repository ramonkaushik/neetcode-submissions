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
    public boolean hasCycle(ListNode head) {
        // return true if has cycle, false otherwise

        // create fast and slow pointers
        ListNode fast = head;
        ListNode slow = head;

        // iterate through linked nodes until something is null or equal
        while(fast != null && fast.next != null) {
            // increment fast 2 nodes and slow 1 node. 
            slow = slow.next;
            fast = fast.next.next;

            // if slow == fast -> we have a cycle
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}
