package kbalad.stack;

import kbalad.stack._94_BinaryTreeInorderTraversal.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class _94_BinaryTreeInorderTraversalTest {

    @Test
    public void inorderTraversal() {
        TreeNode c = new TreeNode(3, null, null);
        TreeNode b = new TreeNode(2, c, null);
        TreeNode root = new TreeNode(1, null, b);
        List<Integer> a = new _94_BinaryTreeInorderTraversal().inorderTraversal(root);
        List<Integer> e = List.of(1, 3, 2);
        assertEquals(e, a);
    }
}