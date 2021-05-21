import java.util.Scanner;

public class FindCounterfeit {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);

        while(sca.hasNextInt()){
            int n = sca.nextInt();
            int count=0;
            if(n==0) break;
            while(n!=1){
                if(n%3==0) {
                    n=n/3;
                    count++;
                }
                else{
                    n=n/3+1;
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
