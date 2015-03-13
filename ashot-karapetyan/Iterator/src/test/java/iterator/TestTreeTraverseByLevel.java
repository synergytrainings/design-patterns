package iterator;

import api.Tree;
import api.TreeIterator;
import api.TreeNode;
import impl.TreeImpl;
import impl.TreeNodeImpl;
import org.junit.Assert;
import org.junit.Test;

public class TestTreeTraverseByLevel {

    @Test
    public void testTreeTraverse() {
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
        Tree<TreeNode> tree = new TreeImpl(root);
        int index = 0;
        TreeIterator<TreeNode> it = tree.getIterator();
        while(it.hasNext()) {
			String nodeName = it.next().toString();
	        Assert.assertEquals(nodeName, index == 0 ? "root" : "c" + index);
	        index++;
        }
    }
}
