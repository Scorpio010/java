import java.util.Arrays;

public class QuickSort {

    public static void quickSort(long[] array) {
        quickSortRange(array, 0, array.length - 1);
    }

    // [from]、[to] 的元素都包含在区间内
    private static void quickSortRange(long[] array, int from, int to) {
        int size = to - from + 1;
        if (size <= 1) {
            return;
        }

        int pivotIdx = partition3(array, from, to);
        // 通过基准值切割后的
        // 左边的区间: [from, pivotIdx - 1]
        // 右边的区间: [pivotIdx + 1, to]

        quickSortRange(array, from, pivotIdx - 1);
        quickSortRange(array, pivotIdx + 1, to);
    }

    private static int partition1(long[] array, int from, int to) {
        long pivot = array[from];
        int left = from;
        int right = to;

        while (left < right) {  // 只要还有没有比较过的元素，就继续
            while (left < right && array[right] >= pivot) {
                right--;
            }

            while (left < right && array[left] <= pivot) {
                left++;
            }

            Swap.swap(array, left, right);
        }

        Swap.swap(array, from, left);
        return left;
    }



    private static int partition2(long[] array, int from, int to) {
        long pivot = array[from];
        int left = from;
        int right = to;

        while (left < right) {  // 只要还有没有比较过的元素，就继续
            while (left < right && array[right] >= pivot) {
                right--;
            }

            array[left] = array[right];

            while (left < right && array[left] <= pivot) {
                left++;
            }

            array[right] = array[left];
        }

        array[left] = pivot;

        return left;
    }

    private static int partition3(long[] array, int from, int to) {
        long pivot = array[from];
        int s = from + 1;
        for (int i = from + 1; i <= to; i++) {
            if (array[i] < pivot) {
                Swap.swap(array, i, s);
                s++;
            }
        }

        Swap.swap(array, from, s - 1);

        return s - 1;
    }

    public static void main(String[] args) {
        long[] array = { 9, 5, 2, 7, 3, 6, 8, 4 };
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}