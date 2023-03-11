package com.neetcode.trees;

public class LowestCommonAncestorBST {

    public static TreeNode lowestCommonAncestorTree(TreeNode root, TreeNode p, TreeNode q) {

        //both values lie in the right subtree
        if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestorTree(root.right, p, q);
        }
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestorTree(root.left, p, q);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTreeFromArray(new Integer[]{6, 2, 8, 0, 4, 7, 9, null,
                null, 3, 5}, 0);
        TreeNode p = TreeNode.buildTreeFromArray(new Integer[]{2, 0, 4, null, null, 3, 5}, 0);
        TreeNode q = TreeNode.buildTreeFromArray(new Integer[]{8, 7, 9}, 0);
        TreeNode.printLevelOrder(lowestCommonAncestorTree(root, p, q));
    }
}
