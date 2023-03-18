package com.neetcode.trees;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

    public static List<Integer> inorderTraversalBinaryTree(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        traversal(root, ans);
        return ans;
    }

    private static void traversal(TreeNode root, List<Integer> ans){
        if(root == null) return;
        traversal(root.left, ans);
        ans.add(root.val);
        traversal(root.right, ans);
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTreeFromArray(new Integer[]{1, 2, 3}, 0);
        System.out.println(inorderTraversalBinaryTree(root));
    }
}
