package sort;

import java.util.Random;

/**
 * Created by Vardan Aivazian
 * Date: 3/29/2019
 * Time: 6:03 PM
 */
public class Helper {

    public static int ARRAY_LENGTH = 10;
    private static Random generator = new Random();

    public static void printArray(int[] array) {
        for (int i=0; i<ARRAY_LENGTH-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[ARRAY_LENGTH-1]);
    }
    
    public static int[] getRandomArray() {
        int[] array = new int[ARRAY_LENGTH];
        initArray(array);
        return array;
    }
    

    private static void initArray(int[] array) {
        for (int i=0; i<ARRAY_LENGTH; i++) {
            array[i] = generator.nextInt(100);
        }
    }
    
}
