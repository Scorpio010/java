public class 数组实现队列 {
    static class  Queue
    {
        int []data;
        int len;
        int head=0;
        int tail=0;
        public Queue(int len)
        {
            this.len=len;
            data=new int[len];
        }
        public boolean InQ(int a)
        {
            if((tail)%len==head&&head!=tail)
            {
                return false;
            }
            data[tail++]=a;
            return true;
        }
        public int OutQ()
        {
            if(head==tail)
            {
                return 0;
            }
            return data[head++];
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Queue q=new Queue(2);
        q.InQ(1);
        q.InQ(2);
        int a=q.OutQ();
        int b=q.OutQ();
        System.out.println(a);
        System.out.println(b);
    }
}
