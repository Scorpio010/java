import java.util.Scanner;

public class Num1InBinary {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNextInt()){
            int n =sca.nextInt();
            int count=0;
            for(int m=0;m<32;m++){
                int b=(n&(1<<m));
                if(b!=0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
