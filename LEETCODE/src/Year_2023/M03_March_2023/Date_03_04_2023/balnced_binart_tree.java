package Year_2023.M03_March_2023.Date_03_04_2023;
//A balanced binary tree is a binary tree in which the left and right subtrees of every node differ in height by at most one.
// In other words, the difference between the heights of the left and right subtrees of any node in the tree is no more than one.
//        Balanced binary trees are important in computer science because they allow for efficient searching and sorting algorithms.
//        When a binary search tree is balanced, the worst-case time complexity for searching or inserting an element into the tree becomes O(log n),
//        where n is the number of elements in the tree.
//        Some common examples of balanced binary trees are AVL trees and red-black trees.
//        These data structures are specifically designed to maintain balance, ensuring that no node's subtrees differ in height by more than one.
//        In contrast, an unbalanced binary tree is a tree in which the difference between the heights of the left and right subtrees of a node can be arbitrarily large.
//        Unbalanced trees can lead to worst-case time complexity of O(n) for searching and insertion operations, as the tree may effectively become a linked list in the worst case.
public class balnced_binart_tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public class buildtree{
        int index=-1;
//        public  bt(int[] nodes){
//            index++;
//            TreeNode root=new TreeNode(nodes[index]);
////            TreeNode root.left=bt();
//        }
    }
    public static void main(String[] args) {

    }
}
