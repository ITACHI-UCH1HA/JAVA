package Date_09_20_2023.Trees;

public class Sum_of_Nodes_Kth_level {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static class BinaryTreeLevelSum {
        public static int sumOfNodesAtKthLevel(TreeNode root, int k) {
            return sumOfNodesAtKthLevel(root, k, 0);
        }

        private static int sumOfNodesAtKthLevel(TreeNode node, int k, int currentLevel) {
            if(node==null){
                return 0;
            }
            if(currentLevel==k){
                return node.val;
            }
            int leftsum=sumOfNodesAtKthLevel(node.left,k,currentLevel+1);
            int rightsum=sumOfNodesAtKthLevel(node.right,k,currentLevel+1);
            return leftsum+rightsum;
        }
    }
    public static void main(String[] args) {
        BinaryTreeLevelSum solution = new BinaryTreeLevelSum();

        // Example usage:
        // Construct a sample binary tree:
        //        1          Level 0
        //       / \
        //      2   3        Level 1
        //     / \   \
        //    4   5   6      Level 2
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        int k = 2; // Find the sum of nodes at level 2
        int sum = solution.sumOfNodesAtKthLevel(root, k);
        System.out.println("Sum of nodes at level " + k + ": " + sum); // Output should be 15
    }
}
