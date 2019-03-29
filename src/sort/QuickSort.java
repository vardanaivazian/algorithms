package sort;

/**
 * Created by Vardan Aivazian
 * Date: 3/29/2019
 * Time: 7:09 PM
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = Helper.getRandomArray();
        Helper.printArray(array);
        sort(array, 0, array.length - 1);
        Helper.printArray(array);
    }


    private static void sort(int[] array, int begin, int end) {
        if (array.length == 0)
            return;
        
        if (begin >= end)
            return;

        int pivotIndex = getPivotIndex(array, begin, end);
        int pivot = array[pivotIndex];
        
        int i = begin, j = end;
        while (i <= j) {
            
            while (array[i] < pivot)
                ++i;
            
            while (array[j] > pivot)
                --j;
            
            if (i <= j) {
                swap(array, i, j);
                ++i;
                --j;
            }
            
        }

        if (begin < j)
            sort(array, begin, j);
        if (end > i)
            sort(array, i, end);
        
    }
    
    private static int getPivotIndex(int[] array, int startIndex, int endIndex) {
        return startIndex + (endIndex - startIndex)/2;
    }
    
    
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
