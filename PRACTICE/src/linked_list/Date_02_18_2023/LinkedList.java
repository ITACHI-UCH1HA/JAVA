package linked_list.Date_02_18_2023;

public class LinkedList {
    private Node head;
    private Node tail;

    public int size;
    LinkedList(){
        this.size=0;
    }
    private class Node{
        private int value;
        private Node next;
        private Node(int value){
            this.value=value;
        }

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void addFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null) tail=head;
        size++;
    }
    public void addLast(int value){
        Node node=new Node(value);
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
        Node node=new Node(value);
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
        Node temp=head;
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
        Node temp=head;
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
        Node currnode=head;
        while(currnode!=null){
            System.out.print(currnode.value+"->");
            currnode=currnode.next;
        }
        System.out.print("end");
    }
}
