public class 分数和差 {
    public static void main(String[] args) {
        double sum = 0;
        for(int i=1;i<=100;i+=2){
            sum+=(1.0/i);
        }
        for(int i=2;i<=100;i+=2){
            sum-=(1.0/i);
        }
        System.out.println(sum);
    }
}
