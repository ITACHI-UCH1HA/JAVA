package HashMap_HashSet;
import java.util.HashSet;
import java.util.Iterator;
public class Date_03_09_2023 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        Iterator it= set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        if(set.contains(6)){
            System.out.println("hai");
        }else System.out.println("iyye");
    }
}
