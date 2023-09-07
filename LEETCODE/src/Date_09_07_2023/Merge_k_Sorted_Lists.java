package Date_09_07_2023;

public class Merge_k_Sorted_Lists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode list3 = new ListNode(2, new ListNode(6));

        // Merge the lists
        ListNode[] lists = {list1, list2, list3};

        ListNode ans=mergeKLists(lists);
        while(ans!=null){
            System.out.print(ans.val+"\t");
            ans=ans.next;
        }
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy=new ListNode();
        for (int i = 0; i < lists.length; i++) {
            dummy.next=merger(dummy.next,lists[i]);
        }
        return dummy.next;
    }

    private static ListNode merger(ListNode l1, ListNode l2) {
        ListNode dummys=new ListNode();
        ListNode ans=dummys;
        while (l1!=null && l2!=null){
            if(l1.val<l2.val){
                ans.next=new ListNode(l1.val);
                l1=l1.next;
            }else{
                ans.next=new ListNode(l2.val);
                l2=l2.next;
            }
            ans=ans.next;
        }
        if(l1!=null){
            ans.next=l1;
        }else{
            ans.next=l2;
        }
        return dummys.next;
    }
}
