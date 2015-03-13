package impl;

import api.Tree;
import api.TreeIterator;
import api.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeImpl implements Tree<TreeNode>{

    private TreeNode root;

    public TreeImpl(TreeNode root) {
        this.root = root;
    }

    @Override
    public TreeNode getRoot() {
        return this.root;
    }

    @Override
    public TreeIterator<TreeNode> getIterator() {
        return new TreeLevelIterator(this.root);
    }


    private class TreeLevelIterator implements TreeIterator<TreeNode> {

        Queue<TreeNode> queue = new LinkedList<>();

        TreeLevelIterator(TreeNode root) {
            queue.add(root);
        }

        @Override
        public boolean hasNext() {
            return queue.isEmpty();
        }

        @Override
        public TreeNode next() {
            TreeNode node = queue.remove();
            queue.addAll(node.getChildren());
            return node;
        }
    }
}
