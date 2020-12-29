import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Random rnd = new Random();
        int r = rnd.nextInt(100);
        System.out.println("随机数为"+r);
        Scanner sca = new Scanner(System.in);
        while(sca.hasNextInt()){
            int n = sca.nextInt();
            if(n==r) {System.out.println("猜对了");
            break;}
            else if(n>r) System.out.println("猜大了");
            else System.out.println("猜小了");
        }
    }
}
