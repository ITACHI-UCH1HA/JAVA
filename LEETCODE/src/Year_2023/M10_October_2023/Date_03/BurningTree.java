package Year_2023.M10_October_2023.Date_03;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class BurningTree {
    private int minTime = 0;

    public int minBurnTime(TreeNode root, int target) {
        TreeNode targetNode = findTargetNode(root, target);

        if (targetNode == null) {
            // Target node not found in the tree
            return -1;
        }

        calculateBurnTime(root, targetNode);
        return minTime;
    }

    private TreeNode findTargetNode(TreeNode node, int target) {
        if (node == null) {
            return null;
        }

        if (node.val == target) {
            return node;
        }

        TreeNode leftResult = findTargetNode(node.left, target);
        TreeNode rightResult = findTargetNode(node.right, target);

        if (leftResult != null) {
            return leftResult;
        }

        return rightResult;
    }

    private int calculateBurnTime(TreeNode node, TreeNode targetNode) {
        if (node == null) {
            return 0;
        }

        int leftTime = calculateBurnTime(node.left, targetNode);
        int rightTime = calculateBurnTime(node.right, targetNode);

        if (node == targetNode || leftTime > 0 || rightTime > 0) {
            minTime = Math.max(minTime, leftTime + rightTime);
            return Math.max(leftTime, rightTime) + 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        BurningTree tree = new BurningTree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int target = 5;
        int burnTime = tree.minBurnTime(root, target);
        System.out.println("Minimum burn time for target " + target + ": " + burnTime); // Output: 3
    }
}
