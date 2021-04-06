public class Sort {
    public static void insertsort(int[] array){
        for (int i=1;i<=array.length;i++){
            int key = array[i];
            int j;
            for (int j=i-1;j>=0&&array[j]>key;j--){
             array[j+1] = array[j];
            }
            array[j+1] = key;
        }
    }
    public static void bubblesort(long[] array){

    }
}
