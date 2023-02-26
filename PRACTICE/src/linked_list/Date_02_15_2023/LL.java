package linked_list.Date_02_15_2023;

public class LL {
    node head;
    node tail;
    int size=0;
//    LL(){
//        node head=null;
//        node tail=null;
//    }
    private class node{
        int value;
        node next;
        node(int value){
            this.value=value;
            this.next=null;
        }
    }
    public void addF(int value){
        node NewNode=new node(value);
        if(head==null){
            head=NewNode;
            tail=NewNode;
            tail.next=null;
            size++;
            return;
        }
        NewNode.next=head;
        head=NewNode;
    }
    public void addL(int value){
        node NewNode=new node(value);
        if(head==null){
            head=NewNode;
            tail=NewNode;
            size++;
            return;
        }
        tail.next=NewNode;
        tail=NewNode;
        size++;
    }
    public void addM(int value,int index){
        if(index==0){
            addF(value);
            return;
        }
        if (index==size){
            addL(value);
            return;
        }
        node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        node NewNode=new node(value);
        NewNode.next=temp.next;
        temp.next=NewNode;
    }
    public void delF(int value){
        if(size==0){
            System.out.println("there is nothing to delete");
            return;
        }
        head=head.next;
    }
    public void delL(int value){
        if(size==0) {
            System.out.println("nothig to delete");
            return;
        }
    }
    public void printA(){
//        if(head==null){
//            System.out.print(head.value+"-->");
//        }
        if(head==null){
            System.out.println("end");
            return;
        }
        node curNode=head;
        while(curNode!=null){
            System.out.print(curNode.value+"->");
            curNode=curNode.next;
        }
        System.out.print("end");
    }
    public void reverse(){
        node temp=head;
        node currnode=head.next;
        for (int i = 0; i < size; i++) {
            currnode.next=temp;
            temp=currnode;
        }
    }
}
