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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int ll=left;
        ListNode l=head;
        ListNode prevl=null;
        while(--left!=0){
            prevl=l;
            l=l.next;
            right--;
        }
        // if(prevl!=null)
        // System.out.print(prevl.val+" ");
        // System.out.println(l.val);
        ListNode nextr=l;
        ListNode r=prevl;
        while(right--!=0){
            r=nextr;
            nextr=nextr.next;
        }
        // System.out.print(r.val+" ");
        // if(nextr!=null)
        // System.out.print(nextr.val);
        ListNode prev=nextr;
        ListNode cur=l;
        ListNode h=l;
        while(cur!=nextr){
            cur=cur.next;
            h.next=prev;
            prev=h;
            h=cur;
        }
        if(prevl!=null)
            prevl.next=r;
        if(ll==1){
            return r;
        }
        return head;
    }
}