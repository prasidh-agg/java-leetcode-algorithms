package com.neetcode.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary search tree, and an integer k, return the kth smallest value
 * * (1-indexed) of all the values of the nodes in the tree.*
 */
public class KthSmallest {
    public static int findKthSmallestElementOfTree(TreeNode root, int k){

        List<Integer> ans = new ArrayList<>();
        traversal(root, ans);
        return ans.get(k - 1);
    }
    private static void traversal(TreeNode root, List<Integer> ans){
        if(root == null) return;
        traversal(root.left, ans);
        ans.add(root.val);
        traversal(root.right, ans);
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTreeFromArray(new Integer[]{3, 1, 4, null, 2}, 0);
        System.out.println(findKthSmallestElementOfTree(root, 2));
    }
}
