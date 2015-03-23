package iterator;

import api.Tree;
import api.TreeIterator;
import api.TreeNode;
import impl.TreeImpl;
import impl.TreeNodeImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestTreeIterators {

	private TreeImpl tree;

	@Before
	public void  before(){
		TreeNode root = new TreeNodeImpl(null, "root");
		TreeNode c1 = new TreeNodeImpl(root, "c1");
		TreeNode c2 = new TreeNodeImpl(root, "c2");
		TreeNode c3 = new TreeNodeImpl(c1, "c3");
		TreeNode c4 = new TreeNodeImpl(c1, "c4");
		TreeNode c5 = new TreeNodeImpl(c2, "c5");
		TreeNode c6 = new TreeNodeImpl(c2, "c6");
		c1.addChild(c4);
		c1.addChild(c3);
		c2.addChild(c5);
		c2.addChild(c6);
		root.addChild(c1);
		root.addChild(c2);
		this.tree = new TreeImpl(root);
	}


	@Test
	public void testLeafs() {
		TreeIterator<TreeNode> it = this.tree.getLeafIterator();
		while(it.hasNext()) {
			TreeNode node = it.next();
			assertThat(node.getChildren(), is(empty()));
		}
	}

	@Test
	public void testTreeTraverse() {
		TreeIterator<TreeNode> it = this.tree.getIterator();
		int index = 0;
		while(it.hasNext()) {
			String nodeName = it.next().toString();
			Assert.assertEquals(nodeName, index == 0 ? "root" : "c" + index);
			index++;
		}
	}

}
