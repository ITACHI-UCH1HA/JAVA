package Year_2023.M09_September_2023.Date_09_20_2023.NeetCode;

public class Same_Tree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public static class SameTree {
        public static boolean isSameTree(TreeNode p, TreeNode q) {
            if(p==null && q==null){
                return true;
            }
            if(p==null || q==null){
                return false;
            }
            if(p.val==q.val){
                return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
            }
            return false;
        }
    }
    public static void main(String[] args) {
        SameTree solution = new SameTree();

        // Example usage:
        // Construct two sample binary trees (p and q):
        // p:
        //     1
        //    / \
        //   2   3
        //
        // q:
        //     1
        //    / \
        //   2   3
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        boolean areSame = solution.isSameTree(p, q);
        System.out.println("Are p and q the same tree? " + areSame); // Output should be true
    }
}
