package bst;

public class BSTree {
    public Node root;

    public BSTree() {
        root = null;
    }

    public boolean find(int key) {
        Node current = root;
        while (current != null) {
            if (key == current.key) {
                return true;
            } else if (key < current.key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    public void insert(int key) {
        if (root == null) {
            root = new Node(key);
            return;
        }
        Node parent = null;
        Node current = root;
        while (current != null) {
            if (key == current.key) {
                throw new RuntimeException("BST 中不允许重复的 key: " + key);
            } else if (key < current.key) {
                parent = current;
                current = current.left;
            } else {
                parent = current;
                current = current.right;
            }
        }

        // 1. 把关键字装入结点中
        Node node = new Node(key);
        if (key < parent.key) {
            parent.left = node;
        } else {
            parent.right = node;
        }
    }

    public boolean remove(int key) {
        Node parent = null;
        Node current = root;
        while (current != null) {
            if (key == current.key) {
                // 删除 current 中的 key
                removeNode(parent, current);
                return true;
            } else if (key < current.key) {
                parent = current;
                current = current.left;
            } else {
                parent = current;
                current = current.right;
            }
        }

        return false;
    }

    private void removeNode(Node parent, Node current) {
        if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (current == parent.left) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (current == parent.left) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else {
            Node goat = current.right;
            Node goatParent = current;
            while (goat.left != null) {
                goatParent = goat;
                goat = goat.left;
            }

            // 替换
            current.key = goat.key;
            // 删除 goat 结点
            if (goatParent == current) {
                goatParent.right = goat.right;
            } else {
                goatParent.left = goat.right;
            }
        }
    }
}
