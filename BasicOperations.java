public class BasicOperations {
    public static ListNode pushfront(int val,ListNode head){
        //头插
        ListNode node = new ListNode(val);
        node.next = head;
        return node;
    }
    public static ListNode popfront(ListNode head){
        //头删
        if (head == null){
            throw new RuntimeException("链表为空，不处理");
        }
        else{
            head = head.next;
        return head;
        }
    }
    public static ListNode pushback(ListNode head,int val){
        //尾插
        ListNode node = new ListNode(val);
        if (head != null){
            ListNode last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = node;
            return head;
        }
        else{
            return node;
        }
    }
    public static ListNode popback(ListNode head){
        //尾删

    }
}
