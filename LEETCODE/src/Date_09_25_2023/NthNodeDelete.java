package Date_09_25_2023;

public class NthNodeDelete {
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
            if(head.next==null){
                return null;
            }
            ListNode dummy=head;
            int count=0;
            while(dummy!=null){
                count++;
                dummy=dummy.next;
            }
            ListNode prev=null;
            dummy=head;
            int target=count-n;
            while(target>0){
                target--;
                prev=dummy;
                dummy=dummy.next;
            }
            prev.next=dummy.next;
            // dummy.next=null;
            return head;
        }
    }
}
