import java.util.Scanner;

public class 牛客0fae60c3b5c64699b7c0f031c2187dde {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String str = sca.next();
        char c = str.charAt(0);
        int count = 1;

        for(int j=0;j<5;j++) {
            for (int i = 0; i < 5 - count; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < count; i++) {
            System.out.print(c + " ");
        }
        System.out.println();
            count++;
        }
    }

}
