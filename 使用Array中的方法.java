import java.util.Arrays;

public class 使用Array中的方法 {
    public static void main(String[] args) {
       // testFill();
       // testsort()
//        testEqual();
        testCopyRange();
//        testCopy();

    }
    private static void testBinarySearch(){
        long[]  a={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.binarySearch(a,3));//2
        System.out.println(Arrays.binarySearch(a,5));//4
        System.out.println(Arrays.binarySearch(a,-1));//-1
        System.out.println(Arrays.binarySearch(a,10));//-10

    }
    private  static void testFill(){
        long[] a = new long[10];
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,1,8,100);
        System.out.println(Arrays.toString(a));
    }
    private static void testEqual(){
        long[] a = {1,2,3,4};
        long[] b = {1,2,3,0};
      //  b[3] = 4;
        System.out.println(Arrays.equals(a,b));
    }
    private  static void testsort(){
        long[] a= {6,4,3,2,8,5,9,1,7};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
    private static void testCopyRange() {
        long[] a = { 1, 2, 3, 4, 5 };

        // [from, to)
        //long[] copy = Arrays.copyOfRange(a, 3, 4);
        //long[] copy = Arrays.copyOfRange(a, 3, a.length);
        long[] copy = Arrays.copyOfRange(a, 3, 10);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(copy));
    }
    private static void testCopy() {
        long[] a = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(a));

        //long[] copy = Arrays.copyOf(a, 3);// 新数组长度小于源长度
        //long[] copy = Arrays.copyOf(a, 5);// 新数组长度等于源长度
        long[] copy = Arrays.copyOf(a, 10);// 新数组长度大于源长度

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(copy));

        Arrays.fill(a, 100);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(copy));
    }
}
