package Date_09_20_2023.NeetCode;

public class Diameter_of_a_tree {
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {

          }
          TreeNode(int val) {
              this.val = val;
          }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
    public static class TreeInfo{
          int ht;
          int dia;
          TreeInfo(int ht,int dia){
              this.ht=ht;
              this.dia=dia;
          }
    }
    public static class BinaryTree {
        static int index = -1;

        public static TreeNode buildTree(int Nodes[]) {
            index++;
            if (Nodes[index] == -1) {
                return null;
            }
            TreeNode root = new TreeNode(Nodes[index]);
            root.left = buildTree(Nodes);
            root.right = buildTree(Nodes);
            return root;
        }
        public static TreeInfo Diameter(TreeNode root){
            if(root==null){
                return new TreeInfo(0,0);
            }
            TreeInfo left=Diameter(root.left);
            TreeInfo right=Diameter(root.right);
            int myHeight=Math.max(left.ht,right.ht)+1;
            int diaLeft= left.dia;
            int diaRight= right.dia;
            int diaRoot=left.ht+right.ht+1;
            int myDiameter=Math.max(Math.max(diaLeft,diaRight),diaRoot);
            TreeInfo myInfo=new TreeInfo(myHeight,myDiameter);
            return myInfo;
        }
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree trees=new BinaryTree();
        TreeNode root=trees.buildTree(nodes);
        System.out.println(trees.Diameter(root).dia);
    }
}
