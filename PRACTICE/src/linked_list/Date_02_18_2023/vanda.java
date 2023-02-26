package linked_list.Date_02_18_2023;

public class vanda {
    public static void main(String[] args) {
        LinkedList prac=new LinkedList();
        prac.addLast(0);
        prac.addLast(1);
        prac.addMid(21,3);
        prac.addLast(2);
        prac.addLast(3);
        prac.addLast(4);
        prac.addLast(5);
//        prac.removeFirst();
//        prac.removeFirst();
//        prac.removeFirst();
        System.out.println(prac.removeLast());
        prac.Printf();
    }
}
