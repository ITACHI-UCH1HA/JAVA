package Date_09_21_2023.BST;

public class Search_In_BST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static class SearchInBST {
        public static TreeNode searchBST(TreeNode root, int target) {
            if(root==null){
                return null;
            }
            if(root.val==target) return root;
            if(root.val>target){
                return searchBST(root.left,target);
            }else{
                return searchBST(root.right,target);
            }
        }

        public static void main(String[] args) {
            SearchInBST solution = new SearchInBST();

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

            int target = 7;
            TreeNode result = solution.searchBST(root, target);

            if (result != null) {
                System.out.println("Node with value " + target + " found in BST.");
            } else {
                System.out.println("Node with value " + target + " not found in BST.");
            }
        }
    }
}
