package Doubly_LL.Date_02_18_2023;

public class LL {
    private node head;
    private node tail;
    public int size;
    LL(){
        size=0;
    }
    private class node{
        private int value;
        private node next;
        private node prev;

        public node(int value) {
            this.value = value;
        }

        public node(int valule,node next) {
            this.value=valule;
            this.next=next;
        }

        public node(int value, node next, node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    public void addFirst(int value){
        node Node=new node(value);
        Node.next=head;
        if(head!=null) head.prev=Node;
        head=Node;
        size++;
    }
    public void print(){
        if(head==null) return;
        node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("end");
    }
}
