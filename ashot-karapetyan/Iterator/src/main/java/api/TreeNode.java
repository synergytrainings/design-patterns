package api;

import java.util.List;

public interface TreeNode {

    void addChild(TreeNode node);

    TreeNode getParent();

    List<? extends TreeNode> getChildren();
}
