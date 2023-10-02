package Year_2023.M10_October_2023.Date_02;

public class count_SubString {
    static TreeNode root=new TreeNode();
    public static class TreeNode{
        TreeNode[] children;
        boolean eow;
        TreeNode(){
            children=new TreeNode[26];
            eow=false;
        }
    }
    public static void insert(String s) {
        TreeNode curr = root;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new TreeNode();
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }
    private static boolean search(String s) {
        TreeNode curr=root;
        for (int i = 0; i < s.length(); i++) {
            int index=s.charAt(i)-'a';
            if(curr.children[index]==null){
                return false;
            }
            curr=curr.children[index];
        }
        return curr.eow;
    }
    public static void main(String[] args) {

    }
}
