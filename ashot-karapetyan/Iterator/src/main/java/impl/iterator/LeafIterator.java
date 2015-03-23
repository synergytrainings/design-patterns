package impl.iterator;

import api.TreeIterator;
import api.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class LeafIterator implements TreeIterator<TreeNode> {


	private final  Iterator<TreeNode> innerIterator;

	public LeafIterator(TreeNode root) {
		List<TreeNode> leafs = new ArrayList<>();
		LevelIterator levelIterator = new LevelIterator(root);
		while(levelIterator.hasNext()){
			TreeNode node = levelIterator.next();
			if(node.getChildren().isEmpty()){
				leafs.add(node);
			}
		}
		this.innerIterator = leafs.iterator();
	}

	@Override
	public boolean hasNext() {
		return this.innerIterator.hasNext();
	}

	@Override
	public TreeNode next() {
		return this.innerIterator.next();
	}
}
