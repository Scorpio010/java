package unrecursion;

public class TreeNode {
    public char val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(char val) {
        this.val = val;
    }

    public TreeNode(char val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
