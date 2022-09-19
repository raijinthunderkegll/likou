package leduo.likou.keepgo.binaryTree;

/**
 * 对称二叉树
 * 给你一个二叉树的根节点root，检查它是否轴对称
 */
class Solution {
    public static boolean isSymmetric(TreeNode root) {
        return handle(root.left,root.right);
    }

    public static boolean handle(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null || rightNode == null) {
            if (leftNode == rightNode) {
                return true;
            }
            return false;
        }
        Integer left = leftNode.val;
        Integer right = rightNode.val;
        if (left != right) {
            return false;
        }
        boolean res = handle(leftNode.left, rightNode.right);
        if (res) {
            return handle(leftNode.right, rightNode.left);
        }
        return res;
    }

    public static void main(String[] args) {
//        int[] source = {2, 3, 3, 4, 5, 5, 4, 0, 0, 8, 9, 9, 8};
        Integer[] source = {1,2,2,null,3,null,3};
        TreeNode root = TreeNode.createTree(0, source);
        boolean isSymmetric = isSymmetric(root);
        System.out.println(isSymmetric);
    }
}