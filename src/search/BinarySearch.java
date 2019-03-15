package search;

/**
 * Created by Vardan Aivazian
 * Date: 3/15/2019
 * Time: 4:37 PM
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] sortedArray = {5, 12, 56, 65, 77, 82, 88, 92, 95, 101, 110, 125, 146, 168, 256, 365};
        int value = 88;
        int index = find(sortedArray, value);
        System.out.println("Index of the " + value + " in the sorted array is: " + index);
    }

    private static int find(int[] sortedArray, int value) {

        int startIndex = 0;
        int endIndex = sortedArray.length - 1;
        int midIndex;

        while (startIndex <= endIndex) {
            midIndex = (endIndex + startIndex) / 2;
            if (sortedArray[midIndex] == value) {
                return midIndex;
            }
            else if (sortedArray[midIndex] > value) {
                endIndex = midIndex - 1;
            }
            else {
                startIndex = midIndex + 1;
            }
        }
        return -1;
    }
}
