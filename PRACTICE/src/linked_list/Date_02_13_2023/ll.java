package linked_list.Date_02_13_2023;

public class ll {
    private node head;
    private node tail;
    private int size=0;
    class node{
        private String value;
        private node next;
        node(String value){
            this.value=value;
            this.next=null;
        }
    }
    public void addFirst(String value){
        node new_node= new node(value);
        if(head==null){
            head=new_node;
            tail=new_node.next;
            size++;
            return;
        }
        new_node.next=head;
        head=new_node;
        size++;
    }
    public void addLast(String value){
        node new_node=new node(value);
        if(head==null){
            head=new_node;
            tail=new_node.next;
            size++;
            return;
        }
        node cur_node=head;
        while(cur_node.next!=null){
            cur_node=cur_node.next;
        }
        cur_node.next=new_node;
        size++;
    }
    public void printf(){
        if(head==null){
            System.out.print(head.value+"-->");
        }
        node curnode=head;
        while(curnode!=null){
            System.out.print(curnode.value+"-->");
            curnode=curnode.next;
        }
        System.out.print("end");
    }
    public void addIndex(String value,int index){
        node newNode=new node(value);
        if(head==null){
            head=newNode;
            size++;
            return;
        }
        int count=0;
        node curNode=head;
        while(count<index){
            count++;
            curNode=curNode.next;
        }
        newNode.next=curNode;
        curNode.next=newNode;
    }
    public void Firstdelete(){
    }
}
