import java.util.Scanner;

public class 水仙花数 {
    public static void main(String[] args) {
        int a,b,c,sum;
        for(int i=1;i<=999;i++){
            a=i/100;
            b=i%100/10;
            c=i%10;
            sum=a*a*a+b*b*b+c*c*c;
            if(sum==i)
                System.out.println(sum);
        }
    }
}
