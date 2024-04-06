package week7;

public class LargestValueFinder {
    public static int [] findLargestValue(int[] data) {
        int largestPos = 0;
        int largest = data[largestPos];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > largest) {
                largestPos = i;
                largest = data[largestPos];
            }
        }
        return new int[] {largestPos,largest};
    }
    
}
