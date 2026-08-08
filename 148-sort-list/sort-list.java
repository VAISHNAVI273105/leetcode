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
 import java.util.LinkedList;
import java.util.Collections;

class Solution {
    public ListNode sortList(ListNode head) {

        ListNode temp = head;
        LinkedList<Integer> list = new LinkedList<>();

        // Store values
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        // Sort values
        Collections.sort(list);

        // Reset temp to head
        temp = head;

        // Put sorted values back
        for (int l : list) {
            temp.val = l;
            temp = temp.next;
        }

        return head;
    }
}