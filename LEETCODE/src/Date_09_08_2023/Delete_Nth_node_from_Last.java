package Date_09_08_2023;

import java.util.ArrayList;

public class Delete_Nth_node_from_Last {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
        int s=size(head);
        int i=s-n;
        ListNode p1=head;
        while(i!=0){
            p1=p1.next;
        }
        p1.next=p1.next.next;
        return head;
    }
    public static int size(ListNode head){
        int i=1;
        while(head!=null){
            head=head.next;
            i++;
        }
        return i;
    }
}
