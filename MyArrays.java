import sun.rmi.runtime.RuntimeUtil;

public class MyArrays {
    public static long[] copyOf(long[] original, int newLength) {
        long[] ans = new long[newLength];
        // 下标(i) 走到哪个位置停下来？
        // original.length 和 ans.length 中小的一个
        int size = Integer.min(original.length, newLength);
        for (int i = 0; i < size; i++) {
            // 需要保证等号两边的下标使用都是合法的！！
            ans[i] = original[i];
        }
        // 如果 newLength > original.length 了
        // ans 中剩余的位置，已经是 long 类型的默认值了（0）
        // 所以我们不需要做什么事情了
        return ans;
    }
    // from >= 0
    public static long[] copyRangeOf(long[] original, int from, int to) {
        if (from < 0) {
            throw new RuntimeException("from 必须 >= 0");
        }

        if (from > to) {
            throw new RuntimeException("from 必须 <= to");
        }

        if (from > original.length) {
            throw new RuntimeException("from 必须 <= original.length");
        }

        int newLength = to - from;

        long[] ans = new long[newLength];

//        ans[0] = original[from];
//        ans[1] = original[from + 1];
//        ans[2] = original[from + 2];

        // i 假如代表的是 ans 的下标
        // i 的合法取值范围必须满足两个条件
        // 1. i 在 ans 中是合法下标  [0, ans.length)
        // 2. from + i 在 original 中是合法下标 [0, original.length)
        //    i 的取值范围 [-from, original.length - from)
        // 最后，i 的合法范围：[0, ans.length) 和 [-from, original.length - from) 的交集
        // i ~ [0, min(ans.length, original.length - from))
        int size = Integer.min(newLength, original.length - from);
        for (int i = 0; i < size; i++) {
            // 保证两边的下标都合法
            ans[i] = original[from + i];
        }

//        // i 假如代表的是 original 的下标
//        for (int i = from; i < ?; i++) {
//            ans[i - from] = original[i];
//        }

        // 思考过填充默认值的情况，和 copyOf 一样

         return ans;
    }

    public static long[] bubbleSort(long[] array) {
        for (int i = 0; i < array.length - i; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    long t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        return array;
    }
    // 前提：array 有序
    // 找到 target 所在的下标，如果 target 有多个，不保证找到哪一个
    // 如果没有找到，返回 -1
    public static int binarySearch(long[] array, long target) {
        // 待查找区间表示为: [low, high)
        // 带查找区间内的元素个数: high - low
        // 定义待查找区间的下限
        int lowIndex = 0;
        // 定义待查找区间的上限
        int highIndex = array.length;

        // 只要带查找区间内还有元素，查找过程就得继续
        while (highIndex - lowIndex > 0) {
            int midIndex = (lowIndex + highIndex) / 2;  // 暂时不考虑溢出的情况
            long midElement = array[midIndex];

            if (target == midElement) {
                return midIndex;
            } else if (target < midElement) {
                // 需要扔掉右边 [midIndex, ...)
                // highIndex 是开区间，所以 = midIndex，但区间里没有 midIndex 对应的元素
                highIndex = midIndex;
            } else {
                // 需要扔掉左边 [..., midIndex]
                // lowIndex 是闭区间，所以 = midIndex + 1，区间里没有 midIndex 对应的元素
                lowIndex = midIndex + 1;
            }
        }

        // high - low <= 0 换言之 带查找区间内一个元素都没有了
        // 说明 target 不在 array 中
        return -1;
    }
    public static void main(String[] args) {

    }
}
