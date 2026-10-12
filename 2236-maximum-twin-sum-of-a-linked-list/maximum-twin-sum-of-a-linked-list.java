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
    // public ListNode reverseList(ListNode head) {
    //     ListNode curr = head;
    //     ListNode next = null;
    //     ListNode prev = null;
        
    //     while(curr != null){
    //         next = curr.next;
    //         curr.next=prev;
    //         prev= curr;
    //         curr = next;
            
    
    //     }
    //     return prev;
    
    // }

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(head != null){
            next=head.next;
            head.next=prev;
            prev = head;
            head=next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
            fast= fast.next;
        }
        ListNode P1=reverseList(slow);
        ListNode P2=head;
        int Max = Integer.MIN_VALUE;
        while(P1 != null && P2 != null){
            int sum =P1.val+P2.val;
            if(sum>Max){
                Max=sum;
            }
            P1 = P1.next;
            P2 = P2.next;
        }

        return Max;

        
    }
}