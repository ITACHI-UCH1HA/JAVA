package Date_09_20_2023.NeetCode;

public class Balanced_Tree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static class BalancedBinaryTree {
        public static boolean isBalanced(TreeNode root) {
            if(root==null){
                return true;
            }
            return isBalanced(root.left) && isBalanced(root.right) && Math.abs(height(root.right)-height(root.left))<=1;
        }
        public static int height(TreeNode root){
            if(root==null){
                return 0;
            }
            int left=height(root.left);
            int right=height(root.right);
            return Math.max(left,right)+1;
        }
    }
    public static void main(String[] args) {
        BalancedBinaryTree solution = new BalancedBinaryTree();

        // Example usage:
        // Construct a sample balanced binary tree:
        //        1
        //       / \
        //      2   2
        //     / \
        //    3   3
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);

        boolean isBalanced = solution.isBalanced(root);
        System.out.println("Is the tree balanced? " + isBalanced); // Output should be true
    }
}
