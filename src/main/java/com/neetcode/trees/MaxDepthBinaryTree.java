package com.neetcode.trees;


/**
 * Given the root of a binary tree, return its maximum depth.
 * <p>
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node
 * * down to the farthest leaf node.*
 */
public class MaxDepthBinaryTree {

    public static int maxDepthTree(TreeNode root){
        if(root == null) return 0;

        int leftHeight = maxDepthTree(root.left);
        int rightHeight = maxDepthTree(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTreeFromArray(new Integer[]{4,2,7,1,3,6,9}, 0);
        System.out.println(maxDepthTree(root));
    }
}
