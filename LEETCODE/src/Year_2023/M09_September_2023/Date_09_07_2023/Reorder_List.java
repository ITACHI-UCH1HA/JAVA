package Year_2023.M09_September_2023.Date_09_07_2023;

public class Reorder_List {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {

    }
    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode middle=slow.next;
        slow.next=null;

        //reverse the second part
        ListNode prev=null;
        ListNode curr=middle;
        while(curr!=null){
            ListNode temp=prev;
            prev=curr;
            curr=curr.next;
            prev.next=temp;
        }
        ListNode Lfirst=prev;
        ListNode first=head;
        while (Lfirst != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = Lfirst.next;
            first.next = Lfirst;
            Lfirst.next = temp1;
            first = temp1;
            Lfirst = temp2;
        }
    }
}
