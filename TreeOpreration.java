public class TreeOpreration {
    public static int count=0;
    public static void countTreeNodesize1(TreeNode root){
        if (root==null){
            return;
        }
        count++;
        countTreeNodesize1(root.left);
        countTreeNodesize1(root.right);
    }
    public static int  countTreeNodesize2(TreeNode root){
        if (root==null){
            return 0;
        }
        int leftSubTreesize = countTreeNodesize2(root.left);
        int rightSubTreesize = countTreeNodesize2(root.right);
      return 1+ leftSubTreesize +rightSubTreesize;
    }
    public static int leafCount;
    public static void countLeafNodesize1(TreeNode root){
        if (root==null){
        return;
        }
        if (root.left==null&&root.right==null){
            leafCount++;
        }
        countLeafNodesize1(root.left);
        countLeafNodesize1(root.right);
    }
    public static int countleafNodesize2(TreeNode root){
        if (root==null){
            return 0;
        }
        if (root.left==null&&root.right==null){
            return 1;
        }
        int leftsize = countleafNodesize2(root.left);
        int rightsize = countTreeNodesize2(root.right);
        return leftsize + rightsize;
    }
    public static void main(String[] args) {
        TreeNode root = new BuildTree().buildTree1();
        count = 0;
        countTreeNodesize1(root);
        System.out.println("树的结点个数是: " + count);


        count = 0;
        countTreeNodesize1(root);
        System.out.println("树的结点个数是: " + count);

        System.out.println("树的结点个数是: " + countTreeNodesize2(root));
        System.out.println("树的结点个数是: " + countTreeNodesize2(root));
        System.out.println("树的结点个数是: " + countTreeNodesize2(root));

        leafCount = 0;
        countLeafNodesize1(root);
        System.out.println("树的叶子结点个数是: " + leafCount);
        leafCount = 0;
        countLeafNodesize1(root);
        System.out.println("树的叶子结点个数是: " + leafCount);
        System.out.println("树的叶子结点个数是: " + countleafNodesize2(root));
        System.out.println("树的叶子结点个数是: " + countleafNodesize2(root));
    }
}
