package Date_09_18_2023.NeetCode.Linked_List;

public class ReverseLL {
    public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        ListNode temp=reverseList(head);
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=prev;
            prev=curr;
            curr=curr.next;
            prev.next=temp;
        }
        return prev;
    }
}
