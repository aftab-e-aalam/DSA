/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        ListNode slow=head;
        ListNode fast=head;
        ListNode t=head;
        boolean hasCycle=false;

        while(fast!= null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                hasCycle=true;
                break;
            }
        }
        if(!hasCycle){
            return null;
        }
        while(slow != t){
            slow=slow.next;
            t=t.next;
        
        }
        return t;
        
    }
}