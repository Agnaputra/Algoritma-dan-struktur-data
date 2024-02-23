package week1;
import java.util.Scanner;

public class Tugas2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String nim = scanner.nextLine();
        System.out.print("OUTPUT : ");
        printSeries(nim);
    }

    public static void printSeries(String nim) {
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
