public class NodeDemo {
    public static void main(String[] args) {
        Node n1 = new Node();
        Node n3 = new Node();
        Node n2 = new Node();
        Node n6 = new Node();

        n1.val = 1;
        n3.val = 3;
        n2.val = 2;
        n6.val = 6;

        n1.next = n3;
        n3.next = n2;
        n2.next = n6;
        n6.next = null;

        // 因为 n1 是第一个结点，所以我们称为头结点
        Node head = n1; // 让 head 和 n1 指向同一个结点对象
        // head 作为头结点，代表一整条链表

        //head链表的遍历
//        Node cur = head;
//
//        while(cur != null){
//            System.out.println(cur.val);
//            cur = cur.next;
//        }
//
//   //通过链表找最后一个结点
//        Node last = head;
//        while (last.next != null){
//            last = last.next;
//        }
//        System.out.println(last.val);

        //找到第n个结点
        int n=4;
        Node nCur = head;
        for (int i = 0; i<n;i++){
            nCur = nCur.next;
        }
        System.out.println(nCur.val);
    }
}
