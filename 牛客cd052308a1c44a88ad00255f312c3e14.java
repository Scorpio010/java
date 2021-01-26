import java.util.Scanner;
public class 牛客cd052308a1c44a88ad00255f312c3e14 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int max=0;
            int score[]=new int[41];
            for(int i=0; i<n; i++){
                int score1=sc.nextInt();
                score[i]=score1;
            }
            //选择排序
           /*for(int i=0; i<n; i++){
               for(int j=i+1; j<n; j++){
                   int temp;
                   if(score[i]<score[j]){
                       temp=score[i];
                       score[i]=score[j];
                       score[j]=temp;
                   }
               }
           }*/
            //冒泡排序
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    int temp;
                    if(score[j]<score[j+1]){
                        temp=score[j];
                        score[j]=score[j+1];
                        score[j+1]=temp;

                    }
                }
            }
            for(int i=0; i<5; i++){
                System.out.printf("%d ",score[i]);
            }
        }
    }

