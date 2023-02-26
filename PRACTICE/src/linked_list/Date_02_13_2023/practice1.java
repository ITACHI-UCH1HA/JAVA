package linked_list.Date_02_13_2023;

public class practice1 {
    public static void main(String[] args) {
        ll list=new ll();
        list.addFirst("3");
        list.addFirst("2");
        list.addFirst("1");
//        list.addLast("0");
        list.addLast("-1");
        list.addLast("-2");
        list.addIndex("0",3);
        list.printf();
    }
}
