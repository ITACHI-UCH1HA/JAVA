package Year_2023.M09_September_2023.Date_09_20_2023.NeetCode;

public class Invert_Binary_Tree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static class InvertBinaryTree {
        public static TreeNode invertTree(TreeNode root) {
            if(root==null){
                return null;
            }
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }
    }
    public static void main(String[] args) {
        InvertBinaryTree solution = new InvertBinaryTree();

        // Example usage:
        // Construct a sample binary tree:
        //     1
        //    / \
        //   2   3
        //  / \
        // 4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeNode invertedRoot = solution.invertTree(root);

        // The tree is now inverted:
        //     1
        //    / \
        //   3   2
        //      / \
        //     5   4
    }
}
