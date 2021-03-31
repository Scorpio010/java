import java.util.Arrays;

public class HeapOperations {
    //时间复杂度logn
    public static void heapify(long[] array, int size, int index) {
        //堆的向下调整
        while (true) {
            int leftIndex = 2 * index + 1; //标记左孩子
            if (leftIndex >= size) {
                return;
            }

            int minIndex = leftIndex;
            int rightIndex = leftIndex + 1;
            if (rightIndex < size && array[rightIndex] < array[leftIndex]) {
                minIndex = rightIndex;
            }

            if (array[index] <= array[minIndex]) {
                return;
            }
            //交换
            long t = array[index];
            array[index] = array[minIndex];
            array[minIndex] = t;

            index = minIndex;
        }

    }
    //时间复杂度nlogn
    public static void createHeap(long[] array,int size){
        int lastChildIndex = size - 1;
        int lastParentIndex = (lastChildIndex - 1) / 2;

        for (int i = lastParentIndex; i >= 0; i--) {
            heapify(array, size, i);
        }
    }

    public static void main(String[] args) {
//        long[] array = {100,3,50,4,7,60,70,8,9,12,13,65,66};
//        heapify(array,13,0);
//        System.out.println(Arrays.toString(array));
        long[] array = { 3, 5, 2, 7, 6, 8, 9, 4, 1, 0, 3, 9, 3, -1, 3 };
        int size = 13;

        createHeap(array, size);

        System.out.println(Arrays.toString(array));
    }
}
