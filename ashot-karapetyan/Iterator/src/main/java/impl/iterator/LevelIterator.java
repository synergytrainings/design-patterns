package impl.iterator;

import api.TreeIterator;
import api.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


public class LevelIterator implements TreeIterator<TreeNode> {

	Queue<TreeNode> queue = new LinkedList<>();

	public LevelIterator(TreeNode root) {
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