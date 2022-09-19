package leduo.likou.keepgo.binaryTree;

/**
 * 路径总和
 * 给你二叉树的根节点root 和一个表示目标和的整数targetSum 。判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和targetSum 。如果存在，返回 true ；否则，返回 false 。
 *
 * 叶子节点 是指没有子节点的节点。
 */
public class HasPathSum {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return handle(root, 0, targetSum);
    }

    private static boolean handle(TreeNode node, int sum, int targetSum) {
        if (node == null || node.val == null) {
            return false;
        }
        sum = sum + node.val;
        if(node.left == null && node.right == null){
            return sum == targetSum;
        } else {
            boolean left = handle(node.left, sum, targetSum);
            boolean right = handle(node.right, sum, targetSum);
            return left || right;
        }
    }

    public static void main(String[] args) {
//        Integer[] source = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
        Integer[] source = {-2, null, -3};
        int targetSum = -5;
        TreeNode root = TreeNode.createTree(0, source);
        System.out.println(hasPathSum(root, targetSum));
    }
}
