
   import java.util.*;
    public class 牛客d84e8339f9444bb6b29bd3f227c8e538 {

        public static void main(String [] args)
        {
            Scanner sca =new Scanner(System.in);
            while(sca.hasNext()){
                int num = sca.nextInt();
                //控制行数
                for(int i=1;i<=num;i++){
                    //空格
                    for(int n=num-i;n>=1;n--){
                        System.out.print(String.join("", " "));
                    }
                    //*号
                    for(int m=1;m<=i;m++){
                        System.out.print(String.join("","*"+" "));
                    }
                    System.out.println();
                }
            }
        }
    }

