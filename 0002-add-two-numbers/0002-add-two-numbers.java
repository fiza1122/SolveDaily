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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode d= new ListNode();
        ListNode cur= d;
        int carry=0;
        while(l1!=null ||l2!=null || carry!=0){
            int x= (l1!=null)?l1.val:0;
            int y= (l2!=null)?l2.val:0;
            int sum= x+y+carry;
            carry=sum/10;
            cur.next=new ListNode(sum%10);
            cur=cur.next;
            if(l1!=null)
                l1=l1.next;
             if(l2!=null)
                 l2=l2.next;
        }
        return d.next;
    }
}
// public ListNode resList = new ListNode(0);
// public ListNode head = resList;
// public int carry = 0;

// public ListNode addTwoNumbers(ListNode l1, ListNode l2) { 
//     int sum = l1.val + l2.val + carry;
//     carry  = sum / 10;
//     resList.next = new ListNode(sum % 10);
//     resList = resList.next;

//     if(l1.next != null && l2.next != null)
//         addTwoNumbers(l1.next, l2.next);  
//     else if (l1.next != null)
//         addTwoNumbers(l1.next, new ListNode(0)); 
//     else if (l2.next != null)
//         addTwoNumbers(new ListNode(0), l2.next);   
//     else if (carry > 0)
//     {
//         resList.next = new ListNode(1);
//         resList = resList.next;
//     }     
//     return head.next;
// }