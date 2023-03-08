package linked_list.Date_03_04_2023;
//reverse a linked list using recursion
public class reverse_linked_list {
    Node head;
    int size=0;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public void addF(int data){
        if(head==null){
            head=new Node(data);
            return;
        }
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("end");
    }
    public void reverse(){
        if(head==null || head.next==null) return;
        Node temp=head;
        System.out.println(temp.data+"->");
        reverse();
    }
    public static void main(String[] args) {
        reverse_linked_list list=new reverse_linked_list();
        list.addF(5);
        list.addF(4);
        list.addF(3);
        list.addF(2);
        list.addF(1);
        list.print();
    }
}
