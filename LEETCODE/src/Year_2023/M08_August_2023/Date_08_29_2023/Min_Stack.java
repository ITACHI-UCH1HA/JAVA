package Year_2023.M08_August_2023.Date_08_29_2023;

import java.util.ArrayList;

public class Min_Stack {
    ArrayList<Integer> list;
    public Min_Stack() {
        list=new ArrayList<>();
    }

    public void push(int val) {
        list.add(val);
    }

    public void pop() {
        if(list.size()==0) return;
        list.remove(list.size()-1);
    }

    public int top() {
        return list.remove(list.size()-1);
    }

    public int getMin() {
        if(list.size()==0) return -1;
        int min=list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i)<min) min=list.get(i);
        }
        return min;
    }
    public static void main(String[] args) {
        Min_Stack stacks=new Min_Stack();
    }
}
