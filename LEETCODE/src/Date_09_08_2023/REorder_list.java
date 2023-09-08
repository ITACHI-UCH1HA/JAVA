package Date_09_08_2023;
public class REorder_list {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        // Test case 1: Reordering a list with even number of nodes
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        reorderList(head1);
        printList(head1); // Expected output: 1 -> 4 -> 2 -> 3

        // Test case 2: Reordering a list with odd number of nodes
        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        reorderList(head2);
        printList(head2); // Expected output: 1 -> 5 -> 2 -> 4 -> 3
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode middle=slow.next;
        slow.next=null;
        //second part
        ListNode prev=null;
        ListNode curr=middle;
        while(curr!=null){
            ListNode temp=prev;
            prev=curr;
            curr=curr.next;
            prev.next=temp;
        }
        ListNode first=head;
        ListNode second=prev;

        while(second!=null){
            ListNode temp1=first.next;
            ListNode temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;
        }
    }
}
