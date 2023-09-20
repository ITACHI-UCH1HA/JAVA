package Date_09_20_2023.NeetCode;
public class Maximum_Depth_of_Tree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        BinaryTreeMaxDepth solution = new BinaryTreeMaxDepth();

        // Example usage:
        // Construct a sample binary tree:
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int maxDepth = solution.maxDepth(root);
        System.out.println("Maximum Depth of Binary Tree: " + maxDepth); // Output should be 3
    }
    public static class BinaryTreeMaxDepth {
        public static int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            } else {
                // Calculate the depth of the left and right subtrees
                int leftDepth = maxDepth(root.left);
                int rightDepth = maxDepth(root.right);

                // Return the maximum of the two depths, plus 1 (for the current node)
                return Math.max(leftDepth, rightDepth) + 1;
            }
        }
    }
}
