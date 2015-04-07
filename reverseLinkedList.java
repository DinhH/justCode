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
	public ListNode reverseList(ListNode head, int m, int n){
		if (head == null || head.next == null){
			return head;
		}
		ListNode temp = new ListNode(0);
        	temp.next=head;
			
		ListNode pre = temp;
		ListNode cur = head;
		ListNode last = head;
		
		int retN = n;
		int retM = m;
		
		while (retM < m || retN < n){
			if(retM < m){
				pre = pre.next;
				cur = cur.next;
				retM++;
			}
			if(retN < n){
				end = end.next;
				retN++;
			}
		}
		reverse(pre,end.next);
		return temp.next;
	}

    }
