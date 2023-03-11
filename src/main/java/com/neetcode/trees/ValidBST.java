package com.neetcode.trees;

public class ValidBST {
    public static boolean isValidBST(TreeNode root){
        if(root == null){
            return true;
        }
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static boolean helper(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }
        if((root.val <= min) || (root.val >= max)){
            return false;
        }
        boolean leftValid = helper(root.left, min, root.val);
        boolean rightValid = helper(root.right, root.val, max);

        return leftValid && rightValid;

    }
    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTreeFromArray(new Integer[]{4,1,5},0);
        System.out.println(isValidBST(root));
    }
}
