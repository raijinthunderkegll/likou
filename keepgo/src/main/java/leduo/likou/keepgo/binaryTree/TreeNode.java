package leduo.likou.keepgo.binaryTree;

public class TreeNode {
    Integer val;
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

    public static TreeNode createTree(int rootIndex, Integer[] values) {
        if (rootIndex >= values.length) {
            return null;
        }
        TreeNode rootNode = new TreeNode();
        rootNode.val = (values[rootIndex]);
        rootNode.left = (createTree(2 * rootIndex + 1, values));
        rootNode.right = (createTree(2 * rootIndex + 2, values));
        return rootNode;
    }

}
