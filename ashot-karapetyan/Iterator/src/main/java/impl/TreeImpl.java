package impl;

import api.Tree;
import api.TreeIterator;
import api.TreeNode;
import impl.iterator.LeafIterator;
import impl.iterator.LevelIterator;

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
        return new LevelIterator(this.root);
    }

	@Override
	public TreeIterator<TreeNode> getLeafIterator(){
		return new LeafIterator(this.root);
	}

}
