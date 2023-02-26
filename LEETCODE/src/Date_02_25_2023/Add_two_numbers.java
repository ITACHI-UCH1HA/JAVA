package Date_02_25_2023;
//https://leetcode.com/problems/add-two-numbers/

public class Add_two_numbers {
    public static class Linklist{
        ListNode head;
        public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
        public void addF(int val){
            if(head==null) {
                head=new ListNode(val);
                return;
            }
            ListNode node=new ListNode(val);
            node.next=head;
            head=node;
        }
        public void printF(){
            if(head==null) return;
            if(head.next==null) System.out.println(head.val);
            ListNode temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
        }
        public ListNode addnumber(ListNode l1,ListNode l2){
            ListNode header=new ListNode(0);
            ListNode temp=header;
            int carry=0;
            while(l1!=null || l2!=null){
                int x=l1!=null? l1.val : 0;
                int y=l2!=null? l2.val : 0;
                int sum=x+y+carry;
                carry=sum/10;
                temp.next=new ListNode(sum%10);
                temp=temp.next;
                if(l1!=null) l1=l1.next;
                if(l2!=null) l2=l2.next;
            }
            if(carry>0) temp.next=new ListNode(carry);
            return header.next;
        }
    }
    public static void main(String[] args) {
        Linklist list1=new Linklist();
        Linklist list2=new Linklist();
        list1.addF(3);
        list1.addF(4);
        list1.addF(2);
        list2.addF(4);
        list2.addF(6);
        list2.addF(5);

    }
}
