package Date_09_20_2023.Trees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Level_Order_Traversal {
    public static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    public static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int Nodes[]) {
            index++;
            if (Nodes[index] == -1) {
                return null;
            }
            Node root = new Node(Nodes[index]);
            root.left = buildTree(Nodes);
            root.right = buildTree(Nodes);
            return root;
        }
        public static void Level_OrderTraversal(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
                Node currnode=q.remove();
                if(currnode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else {
                    System.out.print(currnode.value+" ");
                    if(currnode.left!=null){
                        q.add(currnode.left);
                    }
                    if(currnode.right!=null){
                        q.add(currnode.right);
                    }
                }
            }
        }

        public static int count(Node root) {
            if(root==null){
                return 0;
            }
            int left=count(root.left);
            int right=count(root.right);
            return left+right+1;
        }

        public static int sum_of_roots(Node root) {
            if(root==null){
                return 0;
            }
            int left=sum_of_roots(root.left);
            int right=sum_of_roots(root.right);
            return left+right+root.value;
        }

        public static int height_of_tree(Node root) {
            if(root==null){
                return 0;
            }
            int left=height_of_tree(root.left);
            int right=height_of_tree(root.right);
            return Math.max(left,right)+1;
        }

        public static int Diameter_of_tree_I(Node root) {
            if(root==null){
                return 0;
            }
            int diam1=Diameter_of_tree_I(root.left);
            int diam2=Diameter_of_tree_I(root.right);
            int diam3=height_of_tree(root.left)+height_of_tree(root.right)+1;
            return Math.max(diam3,Math.max(diam1,diam2));
        }
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree trees=new BinaryTree();
        Node root=trees.buildTree(nodes);
        System.out.println(trees.Diameter_of_tree_I(root));
    }
}
