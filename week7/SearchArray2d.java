package week7;
import java.util.Scanner;
public class SearchArray2d {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[][] arr2D = {
            {45, 78, 7, 200, 80},
            {90, 1, 17 ,100 ,50},
            {21, 2, 40,18,65}
        };

        
        System.out.print("Enter the data to be searched: ");
        int searchData = scanner.nextInt();

        
        int[] position = findInArr2D(searchData, arr2D);

        
        if (position != null) {
            System.out.println("Data " + searchData + " found at position (" + position[0] + ", " + position[1] + ")");
        } else {
            System.out.println("Data " + searchData + " not found in the array.");
        }
    }

    public static int[] findInArr2D(int search, int[][] arr2D) {
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] == search) return new int[]{i, j};
            }
        }
        return null;
    }
}

