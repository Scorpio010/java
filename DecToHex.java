import java.util.Scanner;

public class DecToHex {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNextInt()) {
            int n = sca.nextInt();
            while (n > 0) {
                int d = n % 16;
                System.out.println(d);
                n = n / 16;
            }
        }
    }
}