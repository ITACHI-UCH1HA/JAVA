package Year_2023.M09_September_2023.Date_09_20_2023.NeetCode;

public class SubTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static class SubtreeCheck {
        public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if(subRoot==null){
                return true;
            }
            if(root==null){
                return false;
            }
            if(root.val==subRoot.val){
                if(isIdentical(root,subRoot)){
                    return true;
                }
            }
            return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
        }
        public static boolean isIdentical(TreeNode root,TreeNode subRoot){
            if(root==null && subRoot==null){
                return true;
            }
            if(root==null || subRoot==null){
                return false;
            }
            if(root.val==subRoot.val){
                return isIdentical(root.left,subRoot.left) && isIdentical(root.right,subRoot.right);
            }
            return false;
        }
    }
    public static void main(String[] args) {
        SubtreeCheck solution = new SubtreeCheck();

        // Example usage:
        // Construct a sample binary tree (root) and a subRoot tree:
        // Root:
        //     3
        //    / \
        //   4   5
        //  / \
        // 1   2
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        // SubRoot:
        //   4
        //  / \
        // 1   2
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        boolean isSubtree = solution.isSubtree(root, subRoot);
        System.out.println("Is subRoot a subtree of root? " + isSubtree); // Output should be true
    }
}
