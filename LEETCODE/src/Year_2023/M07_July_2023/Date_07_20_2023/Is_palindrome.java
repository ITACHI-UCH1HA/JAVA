package Year_2023.M07_July_2023.Date_07_20_2023;

import java.util.LinkedList;

//https://leetcode.com/problems/palindrome-linked-list/description/
public class Is_palindrome {
    public static void main(String[] args) {
        LinkedList list=new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(1);
        System.out.println(list);
//        System.out.println(isPalindrome(list));
    }
//    public boolean isPalindrome(LinkedList head){
//        if(head==null || head.next==null) return true;
//
//        ListNode p1=head;
//        ListNode p2=reverse(head);
//
//        if(p1.val!=p2.val) return false;
//
//        while(p1.next!=null && p2.next!=null){
//            if(p1.val!=p2.val) return false;
//            p1=p1.next;
//            p2=p2.next;
//        }
//        return true;
//    }
//    public LinkedList reverse(LinkedList head){
//        LinkedList curr=null;
//        LinkedList nextl=head;
//        while(nextl!=null){
//            LinkedList temp=curr;
//            curr=nextl;
//            nextl=nextl.next;
//            curr.next=temp;
//        }
//        return curr;
//    }
}
