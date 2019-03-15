package sort;

import java.util.Arrays;

/**
 * Created by Vardan Aivazian
 * Date: 3/15/2019
 * Time: 5:00 PM
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {54, 1, 56, 650, 77, 82, 8, 92, 95, 15, 12, 125, 14, 168, 26, 3};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int[] array) {

        for (int i = 1; i < array.length; ++i) {
            int j = i - 1;
            int key = array[i];
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }

    }

}
