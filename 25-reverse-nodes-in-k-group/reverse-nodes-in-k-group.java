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
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<Integer> st = new Stack<>();
        ListNode dummy = new ListNode(0);
        ListNode curr = head;
        ListNode tail = dummy;
        while (curr != null) {
            int count = 0;
            ListNode temp = curr;
            while (temp!=null && count<k) {
                st.push(temp.val);
                temp=temp.next;
                count++;
            }
            if (count==k) {
                while (!st.isEmpty()) {
                    tail.next=new ListNode(st.pop());
                    tail = tail.next;
                }
            } 
            else {
                while (curr!=null) {
                    tail.next=new ListNode(curr.val);
                    tail=tail.next;
                    curr=curr.next;
                }
                break;
            }
            curr=temp; 
        }
        return dummy.next;
    }   
}