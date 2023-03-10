package com.neetcode.trees;

public class SameTree {
    public static boolean checkSameTree(TreeNode t1, TreeNode t2) {

        //if one of the nodes is null, both of them should be null
        if(t1 == null || t2 == null) return t1 == null && t2 == null;

        //if values at nodes dont match, then not the same tree
        else if(t1.val != t2.val) return false;

        //if none of the above is satisfied, then perform the check on the left nodes of both the
            // trees and the right nodes of both the trees
        else return checkSameTree(t1.left, t2.left) && checkSameTree(t1.right, t2.right);
    }

    public static void main(String[] args) {
        TreeNode t1 = TreeNode.buildTreeFromArray(new Integer[]{1, 2, 3}, 0);
        TreeNode t2 = TreeNode.buildTreeFromArray(new Integer[]{1, 2, 3}, 0);
        System.out.println(checkSameTree(t1, t2));
    }
}
