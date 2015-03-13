package impl;

import api.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TreeNodeImpl implements TreeNode{

    private TreeNode parent;
    private List<TreeNode> children = new ArrayList<>();
    private String name;

    public TreeNodeImpl(TreeNode parent, String name) {
        this.parent = parent;
        this.name = name;
    }

    @Override
    public void addChild(TreeNode node) {
        this.children.add(node);
    }

    @Override
    public TreeNode getParent() {
        return this.parent;
    }

    @Override
    public List<? extends TreeNode> getChildren() {
        return this.children;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
