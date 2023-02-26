package Binary_Tree.Date_02_25_23;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static class treeinfo{
        int treesheight;
        int treesdiameter;
        treeinfo(int treesheight,int treesdiameter){
            this.treesheight=treesheight;
            this.treesdiameter=treesdiameter;
        }
    }
    public static class BTree{
        static int indx=-1;
        public static Node build(int[] nodes){
            indx++;
            if(nodes[indx]==-1) return null;
            Node newnode=new Node(nodes[indx]);
            newnode.left=build(nodes);
            newnode.right=build(nodes);
            return newnode;
        }
        public static void preorder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root==null){
//                System.out.print("-1 ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void postorder(Node root){
            if(root==null){
//                System.out.print("-1 ");
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelorder(Node root){
            if(root==null) return;
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
                Node curr=q.remove();
                if(curr==null){
                    System.out.println();
                    if(q.isEmpty()) break;
                    else q.add(null);
                }else{
                    System.out.print(curr.data+" ");
                    if(curr.left!=null) q.add(curr.left);
                    if(curr.right!=null) q.add(curr.right);
                }
            }
        }
        public static int countNodes(Node root){
            if(root==null) return 0;
            int left=countNodes(root.left);
            int right=countNodes(root.right);
            return left+right+1;
        }
        public static int sumofNodes(Node root){
            if(root==null) return 0;
            int sumleft=sumofNodes(root.right);
            int sumright=sumofNodes(root.left);
            return sumleft+sumright+ root.data;
        }
        public static int sumofKthNodes(Node root,int k){
            if(root==null) return 0;
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (k>1){
                Node curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()) break;
                    else q.add(null);
                }
                k--;
            }
            int sum=0;
            while(!q.isEmpty()){
                sum=sum+q.remove().data;
            }
            return sum;
        }
        public static int treeheight(Node root){
            if(root==null) return 0;
            int leftheight=treeheight(root.left);
            int rightheight=treeheight(root.right);
            return Math.max(leftheight,rightheight)+1;
        }
        public static int treediameter(Node root){
//            diameter of a tree is total noof nodes present in the longest path of a tree
//            it can be pass through root node or may not pass through
            if(root==null) return 0;
            int leftdiameter=treediameter(root.left);
            int rightdiameter=treediameter(root.right);
            int diameter=treeheight(root.left)+treeheight(root.right)+1;
//            return Math.max(Math.max(leftdiameter,rightdiameter),leftdiameter+rightdiameter+1);
            return Math.max(Math.max(leftdiameter,rightdiameter),diameter);
        }
        public static treeinfo treediameter2(Node root){
            if(root==null) return new treeinfo(0,0);
            treeinfo left=treediameter2(root.left);
            treeinfo right=treediameter2(root.right);
            int height=Math.max(left.treesheight,right.treesheight)+1;
            int dialeft= left.treesdiameter;
            int diaright= right.treesdiameter;
            int diaroot=left.treesheight+right.treesheight+1;
            int diameter=Math.max(Math.max(dialeft,diaright),diaroot);
            treeinfo treedata=new treeinfo(height,diameter);
            return treedata;
        }
    }


    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BTree tree=new BTree();
        Node root=tree.build(nodes);
        System.out.println();
    }
}
