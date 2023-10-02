package Year_2023.M02_Febrauary_2023.Date_02_20_2023;

public class PalindromeLinkedList {
    public static class LinkedList {
        private ListNode head;
        private ListNode tail;

        public int size;
        LinkedList(){
            this.size=0;
        }
        public class ListNode {
            private int value;
            private ListNode next;
            private ListNode(int value){
                this.value=value;
            }

            private ListNode(int value, ListNode next) {
                this.value = value;
                this.next = next;
            }
        }
        public void addFirst(int value){
            ListNode node=new ListNode(value);
            node.next=head;
            head=node;
            if(tail==null) tail=head;
            size++;
        }
        public void addLast(int value){
            ListNode node=new ListNode(value);
//        if(tail==null) {
//            tail=node;
//            head=node;
//        }
            if(tail==null) {
                addFirst(value);
                return;
            }
            tail.next=node;
            tail=node;
            size++;
        }
        public void addMid(int value,int index){
            ListNode node=new ListNode(value);
            if(size==0){
                addFirst(value);
                return;
            }
            if(index==size){
                addLast(value);
                return;
            }
            if(index>(size-1)){
                addLast(value);
                return;
            }
            int count=0;
            ListNode temp=head;
            while(count<index){
                temp=temp.next;
                count++;
            }
            node.next=temp.next;
            temp.next=node;
            size++;
        }
        public int removeFirst(){
            int value=head.value;
            if(tail==null){
                return Integer.MIN_VALUE;
            }
            head=head.next;
            if(head==null) tail=null;
            size--;
            return value;
        }
        public int removeLast(){
            if(size<=1){
                removeFirst();
            }
            int value= tail.value;
            ListNode temp=head;
            int count=0;
            while(count<size-2){
                temp=temp.next;
                count++;
            }
            tail=temp;
            temp.next=null;
            size--;
            return value;
        }
        public void Printf(){
            if(head==null){
                System.out.println("the list is empty");
            }
            ListNode currnode=head;
            while(currnode!=null){
                System.out.print(currnode.value+"->");
                currnode=currnode.next;
            }
            System.out.println("end");
        }
        public ListNode reverse(){

            ListNode currnnode=head;
            ListNode nextnode=head.next;

            while(nextnode!=null){
                ListNode next_nextnode=nextnode.next;
                nextnode.next=currnnode;
                currnnode=nextnode;
                nextnode=next_nextnode;
            }
            head.next=null;
            head=currnnode;
            return head;
//            Node temp=head;
//
//            while(temp!=null){
//                System.out.print(temp.value+"->");
//                temp=temp.next;
//            }
//            System.out.println("end");
        }
        public boolean isPalindrome() {
            if(head==null || head.next==null) return true;
            ListNode temp1=head;
            ListNode temp2=reverse();
            while(temp1!=null){
                if(temp1.value!=temp2.value) return false;
                temp1=temp1.next;
                temp2=temp2.next;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(7);
        list.addLast(1);
        System.out.println(list.isPalindrome());
//        list.reverse();
    }
//    **
//     * Definition for singly-linked list.
//     * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */

}
