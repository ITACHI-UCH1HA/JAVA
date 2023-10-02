package Year_2023.M09_September_2023.Date_09_21_2023.BST;
import java.util.*;
public class BST_LevelOrderTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static class LevelOrderTraversal {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result=new ArrayList<>();

            if(root==null){
                return result;
            }
            Queue<TreeNode> q=new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()){
                int n=q.size();
                List<Integer> list=new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    TreeNode nodes=q.remove();

                    list.add(nodes.val);

                    if(nodes.left!=null){
                        q.add(nodes.left);
                    }
                    if(nodes.right!=null){
                        q.add(nodes.right);
                    }
                }
                result.add(list);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal solution = new LevelOrderTraversal();

        // Example usage:
        // Construct a sample binary tree:
        //        3
        //       / \
        //      9   20
        //         /  \
        //        15   7
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> levelOrderResult = solution.levelOrder(root);

        // Print the level order traversal result
        for (List<Integer> level : levelOrderResult) {
            System.out.println(level);
        }
    }
}