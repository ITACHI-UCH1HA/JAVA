package Year_2023.M09_September_2023.Date_09_07_2023;

public class Add_Two_Numbers {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(5);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
//        l1.next=new ListNode(4);
        ListNode ans=addTwoNumbers2(l1,l2);
        while(ans!=null){
            System.out.print(ans.val+"\t");
            ans=ans.next;
        }
    }

    private static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode();
        ListNode l3=dummy;
        int carry=0;
        while(l1!=null || l2!=null){
            int val1=l1!=null? l1.val : 0;
            int val2=l2!=null? l2.val : 0;
            int sum=carry+ val1+ val2;
            carry=sum/10;
            l3.next=new ListNode(sum%10);
            l3=l3.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(carry>0){
            l3.next=new ListNode(carry);
        }
        return dummy.next;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode();
        ListNode l3=dummy;
        int carry=0;
        while(l1!=null && l2!=null){
            int sum=carry+ l1.val+ l2.val;
            carry=sum/10;
            l3.next=new ListNode(sum%10);
            l3=l3.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum=carry+ l1.val;
            carry=sum/10;
            l3.next=new ListNode(sum%10);
            l3=l3.next;
            l1=l1.next;
        }
        while(l2!=null){
            int sum=carry+ l2.val;
            carry=sum/10;
            l3.next=new ListNode(sum%10);
            l3=l3.next;
            l2=l2.next;
        }
        if (carry > 0) {
            l3.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
