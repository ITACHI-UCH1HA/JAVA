package Date_09_08_2023;

public class palindrome_LL {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        if(head.next==null || head==null) return true;
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
        while(second.next!=null){
            if(first.val==second.val){
                first=first.next;
                second=second.next;
            }else{
                return false;
            }
        }
        return true;
    }
}
