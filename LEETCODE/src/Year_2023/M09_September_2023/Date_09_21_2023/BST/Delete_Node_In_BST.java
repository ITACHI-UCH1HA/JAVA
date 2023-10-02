package Year_2023.M09_September_2023.Date_09_21_2023.BST;
public class Delete_Node_In_BST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static class DeleteNodeInBST {
        public static TreeNode deleteNode(TreeNode root, int key) {
            return new TreeNode(1);
        }
        public static void main(String[] args) {
            DeleteNodeInBST solution = new DeleteNodeInBST();

            // Example usage:
            // Construct a sample BST:
            //       4
            //      / \
            //     2   7
            //    / \
            //   1   3
            TreeNode root = new TreeNode(4);
            root.left = new TreeNode(2);
            root.right = new TreeNode(7);
            root.left.left = new TreeNode(1);
            root.left.right = new TreeNode(3);

            int keyToDelete = 2;
            TreeNode updatedRoot = solution.deleteNode(root, keyToDelete);

            // Print the updated tree (in-order traversal to verify).
        }
    }
}
