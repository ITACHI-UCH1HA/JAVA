package Year_2023.M02_Febrauary_2023.Date_02_22_2023;

public class ReverseLinkedList_II {
    public static class LinkList{
        ListNode head;
        public  void addFirst(int val){
            ListNode node=new ListNode(val);
            if(head==null){
                head=node;
                return;
            }
            node.next=head;
            head=node;
        }
        public void printall(){
            ListNode temp=head;
            if(head==null){
                System.out.println("empty");
                return;
            }
            if(head.next==null){
                System.out.println(head.val+"end");
                return;
            }
            while (temp!=null){
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
            System.out.println("end");
        }
        public ListNode reverse(){
            ListNode prev=null;
            ListNode curr=head;
            while(curr!=null){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return prev;
        }
        public ListNode reverse(ListNode head,ListNode tail){
            ListNode prev=null;
            ListNode curr=head;
            while(curr!=tail){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            curr.next=null;
            return prev;
        }
        public void printh(ListNode start){
            ListNode temp=start;
            if(start==null){
                System.out.println("empty");
                return;
            }
            if(start.next==null){
                System.out.println(start.val+"end");
                return;
            }
            while (temp!=null){
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
            System.out.println("end");
        }
        public ListNode reverseII(int left,int right){
            if(head==null || left==right) return head;
            ListNode leftprev=head;
            ListNode leftnode=head;
            int count=1;
            while (count<(left-1)){
                leftprev=leftprev.next;
                count++;
            }
            count=1;
            while (count<left){
                leftnode=leftnode.next;
                count++;
            }
            count=1;
            ListNode rightnext=head;
            ListNode rightnode=head;
            while (count<right){
                rightnode=rightnode.next;
                count++;
            }
            while (count<right+1){
                rightnext=rightnext.next;
                count++;
            }
            ListNode temp=reverse(leftnode,rightnode);
            leftprev.next=temp;
            temp.next=rightnext;
            return head;
        }
    }
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        LinkList ll=new LinkList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printall();
        ll.printh(ll.reverseII(2,4));
    }
}
