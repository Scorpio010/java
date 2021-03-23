public class TreeTraversal {
    //前序遍历
    public static void preorder(TreeNode root){
        if (root ==null){
            return;
        }
        System.out.printf("%c ",root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(TreeNode root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.printf("%c ",root.val);
        inorder(root.right);
    }
    public static void postorder(TreeNode root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.printf("%c ",root.val);
    }
    //把这颗树按照前序遍历的顺序，修改值
    public static int i= 0;
    public static void modify5thval(TreeNode root){
        if (root==null){
            return;
        }
        i++;
        if (i==5){
            root.val='z';
        }
        System.out.printf("%c ",root.val);
        modify5thval(root.left);
        modify5thval(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = BuildTree.buildTree1();
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        modify5thval(root);
    }

}
