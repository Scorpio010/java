public class DaffNumInMethod {
    public static long pow(int n,int m) {
        long r = 1;
        for(int i=1;i<=m;i++){
            r *= n;
        }
        return r;
    }
    public static int sumCube(int n) {
        int s = 0;
        while(n>0){
            int d=n%10;
            s+= pow(d,3);
            n = n/10;
        }
        return s                      ;
    }
    public static boolean isDaffNumber(int n) {
        return sumCube(n) == n;
    }

    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
            if(isDaffNumber(i)){
                System.out.println(i);
            }
        }
    }
}
