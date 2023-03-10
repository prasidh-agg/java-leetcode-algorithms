package com.neetcode.trees;

import static com.neetcode.trees.SameTree.checkSameTree;

public class SubtreeAnotherTree {
    public static boolean isSubTree(TreeNode root, TreeNode subRoot){

        if (root == null && subRoot == null) {
            return true;
        }
        else if (root == null || subRoot == null) {
            return false;
        }
        else if (checkSameTree(root, subRoot)) {
            return true;
        }
        else{
            return (isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot));
        }
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTreeFromArray(new Integer[]{3,4,5,1,2}, 0);
        TreeNode subRoot = TreeNode.buildTreeFromArray(new Integer[]{4,1,2}, 0);
        System.out.println(isSubTree(root, subRoot));
    }
}
