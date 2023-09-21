package Date_09_21_2023.BST;

import java.util.LinkedList;
import java.util.Queue;

public class Binary_Search_Tree {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    public static Node BuildTree(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(val<root.val){
            root.left=BuildTree(root.left,val);
        }else {
            root.right=BuildTree(root.right,val);
        }
        return root;
    }
    public static void InorderTraversal(Node root){
        if(root==null){
            return;
        }
        InorderTraversal(root.left);
        System.out.print(root.val+" ");
        InorderTraversal(root.right);
    }
    public static void main(String[] args) {
        int[] nodes={3,1,5,2,6};
        Node nodess=null;
        for (int num:nodes) {
            nodess=BuildTree(nodess,num);
        }
        Level_orderTraversal(nodess);
    }

    private static void Level_orderTraversal(Node root) {
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.val+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
}
