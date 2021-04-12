package hashtable;

import hashtable.Node;

public class MyHashTable {
    // 1. 核心结构 —— 数组（数组类型 Node）
    // 数组中保存的是一个一个的头结点，进而代表一条条的链表
    private Node[] array;
    private int size;   // 维护 关键字数目

    public MyHashTable() {
        array = new Node[11];
        size = 0;
    }

    public boolean insert(int key) {
        Node node = new Node(key);
        int index = key % array.length;
        if (find(key)) return false;
        node.next=array[index];
        array[index] = node;

            return true;
        }

    }

    public boolean remove(int key) {
        int index = key%array.length;

    }

    public boolean find(int key) {
        // 1. 把关键字转成一个合法的下标 —— 利用哈希函数
        int index = key % array.length;
        // 通过下标，可以得到链表，链表的头节点是 array[index]
        // 遍历链表去找 key
        for (Node cur = array[index]; cur != null; cur = cur.next) {
            if (cur.key == key) {
                return true;
            }
        }

        return false;
    }
}
