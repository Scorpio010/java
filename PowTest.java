public class PowTest {
    public static long pow(int n,int m){
        long r = 1;
        for(int i=1;i<=m;i++){
            r *= n;
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println(pow(4,2));
    }
}
