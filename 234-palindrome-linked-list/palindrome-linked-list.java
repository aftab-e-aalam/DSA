import java.util.ArrayList;
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
        List<Integer> Arr= new ArrayList<>();
        ListNode node = head;
        while(node !=null){
            Arr.add(node.val);
            node = node.next;
        }
        int i=0;
        int j =Arr.size()-1;
        while(i<j){
            if(Arr.get(i) != Arr.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}