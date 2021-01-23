public class 数组实现栈 {
    static class  Stack
    {
        int []data;
        int size;
        int top=-1;
        public Stack(int size)
        {
            this.size=size;
            data=new int[size];
        }
        public boolean InS(int a)
        {
            if(top>=size)
            {
                return false;
            }
            data[++top]=a;
            return true;
        }
        public int OutS()
        {
            if(top==-1)
            {
                return 0;
            }
            return data[top--];
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Stack s=new Stack(2);
        s.InS(1);
        s.InS(2);
        int a=s.OutS();
        int b=s.OutS();
        System.out.println(a);
        System.out.println(b);
    }
}
