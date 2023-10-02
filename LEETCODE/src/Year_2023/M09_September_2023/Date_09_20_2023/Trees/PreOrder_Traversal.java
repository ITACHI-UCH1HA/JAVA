package Year_2023.M09_September_2023.Date_09_20_2023.Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PreOrder_Traversal {
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
    public static class BinaryTree{
        static int index=-1;
        public static Node buildTree(int Nodes[]){
            index++;
            if(Nodes[index]==-1){
                return null;
            }
            Node root=new Node(Nodes[index]);
            root.left=buildTree(Nodes);
            root.right=buildTree(Nodes);
            return root;
        }
        static List<Integer> list=new ArrayList<>();
        public static int[] traversal(Node root){
            if(root==null){
                list.add(-1);
                return new int[]{-1};
            }
            list.add(root.value);
            traversal(root.left);
            traversal(root.right);
            int[] ans=list.stream().mapToInt(Integer::intValue).toArray();
//            list=new ArrayList<>();
            return ans;
        }
        public static void traversals(Node root){
            if(root==null){
                System.out.print(-1+" ");
                return;
            }
            System.out.print(root.value+" ");
            traversals(root.left);
            traversals(root.right);
        }
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree trees=new BinaryTree();
        Node root=trees.buildTree(nodes);
        System.out.println(Arrays.toString(trees.traversal(root)));
    }
}
