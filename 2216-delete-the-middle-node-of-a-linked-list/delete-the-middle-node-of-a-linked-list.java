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
    public ListNode deleteMiddle(ListNode head) {

        // Count number of nodes
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // If only one node
        if (count == 1) {
            return null;
        }

        // Find node before middle
        int mid = count / 2;

        temp = head;

        for (int i = 1; i < mid; i++) {
            temp = temp.next;
        }

        // Delete middle node
        temp.next = temp.next.next;

        return head;
    }
}