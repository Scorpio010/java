public class PrintLeapYear {
    public static boolean isLeapYear(int year){
       if(year%100==0){
           if (year % 400 == 0) {
               return true;
           }
           else {
               return false;
           }
       }
       else {
           if(year %4==0){
               return true;
           }
           else {
               return false;
           }
       }
    }
    public static void main(String[] args) {
        for(int i=1000;i<=2100;i++){
            if (isLeapYear(i)){
                System.out.println(i+"是闰年");
            }
        }
    }
}
