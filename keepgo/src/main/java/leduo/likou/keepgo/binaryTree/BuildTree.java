package leduo.likou.keepgo.binaryTree;

/**
 * 给定两个整数数组 inorder 和 postorder ，其中 inorder 是二叉树的中序遍历， postorder 是同一棵树的后序遍历，请你构造并返回这颗二叉树。
 * <p>
 * 提示:
 * <p>
 * 1 <= inorder.length <= 3000
 * postorder.length == inorder.length
 * -3000 <= inorder[i], postorder[i] <= 3000
 * inorder和postorder都由 不同 的值组成
 * postorder中每一个值都在inorder中
 * inorder保证是树的中序遍历
 * postorder保证是树的后序遍历
 */
public class BuildTree {

    /**
     * 思路：后序遍历的最后一个元素是根节点，得到中序遍历根节点的位置，左边为左子树，右边为右子树
     *
     * @param inorder
     * @param postorder
     * @return
     */
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null) {
            return null;
        }

        int rootVal = postorder[postorder.length - 1];

        TreeNode root = new TreeNode(rootVal);
        // 根节点的索引
        int index = 0;
        while (inorder[index++] != rootVal) {

        }

        if (index == 0) {
            return root;
        }

        handle(new TreeNode(inorder[0]), 0, index, inorder);
        handle(new TreeNode(inorder[index + 1]), index + 1, inorder.length, inorder);

        return null;
    }

    private static void handle(TreeNode node, int i, int length, int[] inorder) {
        TreeNode next = new TreeNode(inorder[++i]);


    }


}
