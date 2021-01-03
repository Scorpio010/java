import java.util.Scanner;

public class 牛客1f7c1d67446e4361bf4af67c08e0b8b0 {
    public static void main(String[] args) {
        Scanner sca= new Scanner(System.in);
        int n = sca.nextInt();
        int a = n/1000;
        n=n%1000;
        int b = n/100;
        n=n%100;
        int c = n/10;
        n=n%10;
        int d = n;
        System.out.print(d);
        System.out.print(c);
        System.out.print(b);
        System.out.print(a);
    }
}
