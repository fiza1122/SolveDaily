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
        ListNode tail= null;
        ListNode curr = null;;
        int size=0;
         ListNode temp=head;
        while(temp!=null){
            size++;
            temp= temp.next;
        }
        if(size==n){
            head=head.next;
            return head;
        }
        temp=head;
        curr=null;
      
        for(int i=1;i<=size-n;i++){
            curr=temp;
            temp=temp.next;
        }
        curr.next=temp.next;
        return head;
    }
}