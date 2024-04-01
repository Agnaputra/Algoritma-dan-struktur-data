package week5;
import java.util.Scanner;
public class MainScoreAlgSdt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 

        ScoreAlgSdt[] students = new ScoreAlgSdt[numStudents];

        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Masukkan data untuk mahasiswa ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String name = scanner.nextLine();
            System.out.print("Nilai Assignment: ");
            int assignmentScore = scanner.nextInt();
            System.out.print("Nilai Quiz: ");
            int quizScore = scanner.nextInt();
            System.out.print("Nilai Mid: ");
            int midScore = scanner.nextInt();
            System.out.print("Nilai Final: ");
            int finalScore = scanner.nextInt();

            students[i] = new ScoreAlgSdt(name, assignmentScore, quizScore, midScore, finalScore);
            scanner.nextLine(); 
        }

        // Menghitung total skor untuk semua mahasiswa
        double total = 0;
        for (ScoreAlgSdt student : students) {
            total += student.calculateTotalScore();
        }

        // Menghitung rata-rata skor
        double average = total / numStudents;

        // Mencetak nilai rata-rata
        System.out.println("\nNilai rata-rata dari semua mahasiswa: " + average);

        scanner.close(); 
    }
}