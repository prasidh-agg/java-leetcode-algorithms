package com.neetcode.trees;

public class InvertBinaryTree {

    public static TreeNode invertABinaryTree(TreeNode root) {

        if (root == null) return null;


        TreeNode left = invertABinaryTree(root.left);
        TreeNode right = invertABinaryTree(root.right);

        root.right = left;
        root.left = right;

        return root;

    }

    public static void main(String[] args) {

        TreeNode treeNode = TreeNode.buildTreeFromArray(new Integer[]{4, 2, 7, 1, 3, 6, 9}, 0);
        System.out.println("Original Tree: \n");
        TreeNode.printLevelOrder(treeNode);

        TreeNode binaryTree = invertABinaryTree(treeNode);
        System.out.println("Inverted Tree:  \n");
        TreeNode.printLevelOrder(binaryTree);
//        TreeNode.printTree(treeNode);
    }
}
