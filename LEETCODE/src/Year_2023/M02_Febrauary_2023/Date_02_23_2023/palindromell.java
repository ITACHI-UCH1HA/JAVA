package Year_2023.M02_Febrauary_2023.Date_02_23_2023;

public class palindromell {
    public static class LL {
        public Node head;
        private class Node{
            public int data;
            public Node next;
            public Node(int data){
                this.data = data;
            }
            public Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }
        }
        public void addF(int value){
            if(head==null){
                head=new Node(value);
                return;
            }
            Node temp=new Node(value);
            temp.next=head;
            head=temp;
        }
        public void print(){
            if(head==null) return;
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data +"->");
                temp=temp.next;
            }
            System.out.println("end");
        }
        public void sort(LL list1,LL list2){
            Node ans=sorted(list1.head,list2.head);
            while(ans!=null){
                System.out.print(ans.data +"->");
                ans=ans.next;
            }
            System.out.println("end");
        }
        public Node sorted(Node head1,Node head2){
            if(head1==null) return head2;
            if(head2==null) return head1;
            Node temp,temp1=head1,temp2=head2;
            if(temp1.data >temp2.data){
                temp=temp2;
                temp2=temp2.next;
            }else {
                temp=temp1;
                temp1=temp1.next;
            }
            Node header=temp;
            while(temp1!=null && temp2!=null){
                if(temp1.data >temp2.data){
                    temp.next=temp2;
                    temp2=temp2.next;
                    temp=temp.next;
                }else{
                    temp.next=temp1;
                    temp1=temp1.next;
                    temp=temp.next;
                }
            }
            while(temp1!=null){
                temp.next=temp1;
                temp1=temp1.next;
                temp=temp.next;
            }
            while (temp2!=null){
                temp.next=temp2;
                temp2=temp2.next;
                temp=temp.next;
            }
            return header;
        }
        public void reverse(){
            Node prev=null;
            Node curr=head;
            while(curr!=null){
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            Node temp=prev;
            while (temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("end");
        }
        public Node reversed(){
            Node prev=null;
            Node curr=head;
            while(curr!=null){
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return prev;
        }
        public boolean palindrome(){
            if(head==null || head.next==null) return true;
            Node temp=head;
            Node temper=reversed();
            while(temp!=null && temper!=null){
                if(temp.data!= temper.data) return false;
                temp=temp.next;
                temper=temper.next;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        LL list=new LL();
        list.addF(1);
        list.addF(2);
        list.addF(3);
        list.addF(2);
        list.addF(2);
        list.print();
        list.reverse();
        System.out.println(list.palindrome());
    }
}
