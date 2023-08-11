package com.neetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public static List<List<Integer>> levelOrderTraversalTree(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        //if queue not empty, keep processing
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currLevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {

                //remove the first element from queue and gets its value
                TreeNode curr = queue.remove();
                currLevel.add(curr.val);

                //if left exists, add it to the queue
                if (curr.left != null) queue.add(curr.left);

                //if right exists, add it to the queue
                if (curr.right != null) queue.add(curr.right);
            }
            result.add(currLevel);
        }
        return result;
    }

    public static List<List<Integer>> levelOrderTraversalRecursive(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        helper(root, list, 0);
        return list;
    }

    static void helper(TreeNode root, List<List<Integer>> list, int k) {
        if (root == null) {
            return;
        }
        if (list.size() == k) {
            List<Integer> arr = new ArrayList<>();
            list.add(arr);
        }
        list.get(k).add(root.val);
        helper(root.left, list, k + 1);
        helper(root.right, list, k + 1);
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTreeFromArray(new Integer[]{3, 9, 20, null, null, 15, 7}, 0);
        TreeNode root2 = TreeNode.buildTreeFromArray(new Integer[]{1}, 0);
        System.out.println(levelOrderTraversalRecursive(root));
        System.out.println(levelOrderTraversalTree(root2));
    }
}
