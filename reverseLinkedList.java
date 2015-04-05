/*Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,

return 1->4->3->2->5->NULL.*/


puublic class Solution{
	public void reverse(ListNode pre, ListNode endNext){
        ListNode cur=pre.next;
        
        while (cur.next!=endNext){
            
            ListNode next=cur.next;
            ListNode temp=pre.next;
            pre.next=next;
            cur.next=next.next;
            
            next.next=temp;
            
        }
    }
