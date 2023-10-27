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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null ||head.next==null)
            return null;
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        count-=n;
        //System.out.println(count);
        temp=head;
        ListNode prev=null;
        while(count-->0 && temp!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        // System.out.println(temp.val);
        if(prev==null)
            head=head.next;
        else 
            prev.next=temp.next;
        return head;
    }
}