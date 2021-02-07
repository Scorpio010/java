import java.util.Scanner;

public class 牛客2cdea429fa414fbba26e6c821724ca06 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            int n = sca.nextInt();
            for (int i=n;i>0;i--){
                for (int j=0;j<i;j++){
                    System.out.printf("* ");
                }
                System.out.println();
            }
        }
    }
}
