package week7;

public class MainLargest {
    private static void displayData(int [] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%s ", data[i]);
        }
        System.out.println();    
    }

    private static void displayLargestValue(int[] data) {
        int[] sortedData = Sorting.sortAscending(data);
        int[] largestValue = LargestValueFinder.findLargestValue(sortedData);
        System.out.printf("Largest value position : %d\n", largestValue[0]);
        System.out.printf("Largest value : %d\n", largestValue[1]);
    }

    public static void main(String[] args) {
        int [] data = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        System.out.println("Unsorted data: ");
        displayData(data);

        System.out.println("Sorted data (asc):");
        int[] sortedDataAscending = Sorting.sortAscending(data.clone());
        displayData(sortedDataAscending);

        System.out.println("Sorted data (desc): ");
        int [] sortedDataDescending = Sorting.sortDescending(data.clone());
        displayData(sortedDataDescending);

        displayLargestValue(data.clone());
    }
    
}
