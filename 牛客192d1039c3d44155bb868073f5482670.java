import java.util.Scanner;

public class 牛客192d1039c3d44155bb868073f5482670 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            int n = sca.nextInt();
            for (int i=0;i<n;i++){
                for (int j=0;j<n-i-1;j++){
                    System.out.printf("  ");
                }
                for (int j=0;j<=i;j++){
                    System.out.printf("* ");
                }
                System.out.println();
            }
        }
    }
}
