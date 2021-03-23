import sun.reflect.generics.tree.Tree;

public class TreeDemo {
    public static void main(String[] args) {
        TreeNode root = null;
        TreeNode a = new TreeNode('a');
        TreeNode b = new TreeNode('b');
        TreeNode c = new TreeNode('c');
        TreeNode d = new TreeNode('d');
        TreeNode e = new TreeNode('e');
        TreeNode f = new TreeNode('f');
        a.left = b; a.right = c;
        b.left = d;
        c.left = e; c.right = f;
        System.out.println("he");
    }
}
