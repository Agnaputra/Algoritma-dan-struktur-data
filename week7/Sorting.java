package week7;

public class Sorting {
    public static int [] sortAscending(int[] data) {
        for(int i = 1; i < data.length; i++) {
            int tmp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > tmp ) {
                data[j + 1] = data [j];
                j--;
            }
        }
        return data;
    }
    public static int [] sortDescending(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int tmp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] < tmp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = tmp;
        }
        return data;
    }
}
