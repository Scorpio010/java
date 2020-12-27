import java.util.Scanner;

public class 牛客c4ae7bcac7f9491b8be82ee516a94899 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int seconds = sca.nextInt();
        int h=seconds/3600;
        int m=(seconds%3600)/60;
        int s=(seconds%3600)%60;
        System.out.print(h+" ");
        System.out.print(m+" ");
        System.out.print(s);

    }
}
