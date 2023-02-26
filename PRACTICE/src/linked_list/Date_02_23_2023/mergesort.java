package linked_list.Date_02_23_2023;

public class mergesort {
    public static void main(String[] args) {
        LL list1=new LL();
        LL list2=new LL();
        list1.addF(8);
        list1.addF(6);
        list1.addF(4);
        list1.addF(2);
        list1.addF(0);
        list2.addF(9);
        list2.addF(7);
        list2.addF(5);
        list2.addF(3);
        list2.addF(1);
        list1.print();
        list2.print();
        list1.sort(list1,list2);
    }
}
