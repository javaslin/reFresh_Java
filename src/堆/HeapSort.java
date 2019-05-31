package 堆;

public class HeapSort {
    public static void heapSort(int[] array) {
        if (array == null || array.length < 1) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            heapInsert(array, i);
        }
        int heapSize = array.length;
        swap(array, 0, --heapSize);
        while (heapSize > 0) {
            heapify(array, 0, heapSize);
            swap(array, 0, --heapSize);
        }
    }


    public static void heapInsert(int[] array, int index) {
        while (array[index] > array[(index - 1) / 2]) {
            swap(array, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    public static void heapify(int[] array, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            int largest = left + 1 < heapSize && array[left + 1] > array[left] ? left + 1 : left;
            largest = array[largest] > array[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(array, index, largest);
            index = largest;
            left = index * 2 + 1;
        }
    }

    public static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void main(String[] args) {
        int[] array = new int[]{9, 8, 7, 76, 5};
        heapSort(array);
        for (int a : array) {
            System.out.println(a);
        }
    }
}
