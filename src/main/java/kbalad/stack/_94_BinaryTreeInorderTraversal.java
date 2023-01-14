package kbalad.stack;

import java.util.ArrayList;
import java.util.List;

public class _94_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        traverse(root, out);
        return out;
    }

    private void traverse(TreeNode node, List<Integer> out) {
        if (node == null) return;
        traverse(node.left, out);
        out.add(node.val);
        traverse(node.right, out);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
