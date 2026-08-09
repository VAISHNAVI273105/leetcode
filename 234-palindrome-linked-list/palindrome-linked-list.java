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
    public boolean isPalindrome(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int[] arr=new int[count];
        int i=0;
        int j=count-1;
        temp=head;
        int k=0;
        while(temp!=null){
            arr[k]=temp.val;
            k++;
            temp=temp.next;
        }
        while(i<j){
            if(arr[i]!=arr[j]){ return false;}
            i++;
            j--;

        }
        return true;
    }
}