class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        return ((level(root, x, 0) == level(root, y, 0)) && (!isSibling(root, x, y)));
    }

    boolean isSibling(TreeNode node, int x, int y) {
        if (node == null) {
            return false;
        }
        return ((node.left != null && node.right != null && 
                ((node.left.val == x && node.right.val == y) || (node.left.val == y && node.right.val == x)))) ||
                isSibling(node.left, x, y) || isSibling(node.right, x, y);
    }

    int level(TreeNode node, int x, int lev) {
        if (node == null) {
            return -1;
        }
        if (node.val == x) {
            return lev;
        }
        int l = level(node.left, x, lev + 1);
        if (l != -1) {
            return l;
        }
        return level(node.right, x, lev + 1);
    }
}
