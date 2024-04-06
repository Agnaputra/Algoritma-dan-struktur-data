package week7.MergeSortTest;

public class MainMerge {
    public static void main(String[] args) {
        
        int data [] = {10,40,30,50,70,20,100,90};
        System.out.println("sorting with merge sort");
        MergeSorting msort = new MergeSorting();
        System.out.println("initial data");
        msort.printArray(data);
        msort.mergeSort(data);
        System.out.println("sorted data  ");
        msort.printArray(data);
    }
    
}
