package sort;

import java.util.Arrays;

/**
 * Created by Vardan Aivazian
 * Date: 3/15/2019
 * Time: 4:38 PM
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {54, 1, 56, 650, 77, 82, 8, 92, 95, 15, 12, 125, 14, 168, 26, 3};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    
    
    private static void sort(int[] array) {
        
        int least;
        for (int i = 0; i < array.length - 1; ++i) {
            least = i;
            for (int j = i + 1; j < array.length; ++j) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            int tmp = array[i];
            array[i] = array[least];
            array[least] = tmp;
        }
    }
    
}
