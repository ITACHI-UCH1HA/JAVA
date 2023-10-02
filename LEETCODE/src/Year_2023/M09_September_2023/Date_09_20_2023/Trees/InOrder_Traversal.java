package Year_2023.M09_September_2023.Date_09_20_2023.Trees;

public class InOrder_Traversal {
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
        public static void InOrder_traversals(Node root){
            if(root==null){
//                System.out.print(-1+" ");
                return;
            }
            InOrder_traversals(root.left);
            System.out.print(root.value+" ");
            InOrder_traversals(root.right);
        }
        public static void PostOrder_traversals(Node root){
            if(root==null){
//                System.out.print(-1+" ");
                return;
            }
            PostOrder_traversals(root.left);
            PostOrder_traversals(root.right);
            System.out.print(root.value+" ");
        }
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree trees=new BinaryTree();
        Node root=trees.buildTree(nodes);
        trees.PostOrder_traversals(root);
    }
}
