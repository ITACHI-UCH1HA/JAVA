package BinarySearchTrees;

public class Binary_Search_Tree {
    public static class Node{
        int data;
        Node rootleft;
        Node rootright;
        public Node(int data){
            this.data=data;
        }
        public  Node(int data,Node rootleft){
            this.data=data;
            this.rootleft=rootleft;
        }
        public Node(int data, Node rootleft, Node rootright) {
            this.data = data;
            this.rootleft = rootleft;
            this.rootright = rootright;
        }
    }
    public static Node build_BST(Node root,int data){
        if(root==null) return root=new Node(data);
        if(root.data>data) root.rootleft=build_BST(root.rootleft,data);
        else root.rootright=build_BST(root.rootright,data);
        return root;
    }
    public static boolean search(Node root,int target){
        if(root==null) return false;
        if(root.data==target) return true;
        else if(root.data>target) return search(root.rootleft,target);
        else return search(root.rootright,target);
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.rootleft);
        System.out.print(root.data+" ");
        inorder(root.rootright);
    }
    public static void main(String[] args) {
      int[] nodes={5,4,3,2,1};
      Node root=null;
        for (int i = 0; i < nodes.length; i++) {
            root=build_BST(root,nodes[i]);
        }
        System.out.println(search(root,2));
    }
}
