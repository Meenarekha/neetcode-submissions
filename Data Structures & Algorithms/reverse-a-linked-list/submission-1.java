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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next =  prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
/*next = curr.next;  // 1. Save
curr.next = prev;  // 2. Reverse
prev = curr;       // 3. Move prev
curr = next;       // 4. Move curr*/

