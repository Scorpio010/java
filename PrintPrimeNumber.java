public class PrintPrimeNumber {
      public static  boolean isPrimeNumber(int n){
          for(int i=2;i<n;i++){
              if(n%i==0){
                  return false;
              }
          }
          return true;
      }
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            if(isPrimeNumber(i)){
                System.out.println(i+"是素数");
            }
        }
    }
}
