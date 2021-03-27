package unrecursion;

import nowcoder.p_4b91205483694f449f94c179883c1fef.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//非递归前中后序遍历二叉树
public class Traversal {

    public static void preorder(TreeNode root){
        TreeNode cur;
        Stack<TreeNode> stack = new Stack<>();
        cur = root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                System.out.println(cur.val);
                cur = cur.left;
            }
            TreeNode pop = stack.pop();
            cur = cur.right;
        }
    }
    public static void inorder(TreeNode root){
        TreeNode cur;
        Stack<TreeNode> stack = new Stack<>();
        cur = root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);

                cur = cur.left;
            }
            TreeNode pop = stack.pop();
            System.out.println(pop.val);
            cur = cur.right;
        }
    }
    public static void postorder(TreeNode root){
        TreeNode cur;
        TreeNode last=null;//上一次后序遍历经过的结点
        Stack<TreeNode> stack = new Stack<>();
        cur = root;
        while(cur!=null||!stack.isEmpty()){
            while (cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode pop = stack.peek();
            if (pop.right==null||pop.right==last){
                System.out.println((char)pop.val);
                last = pop;
                stack.pop();
            } else {
                // 第二次经过
                cur = pop.right;
            }
            }
        }
        //层序遍历
        public static void levelorder(TreeNode root){
        if (root==null) return;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                TreeNode node = queue.remove();
                System.out.println(node.val);
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
        }
    }

