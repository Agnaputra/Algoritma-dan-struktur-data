package week7;

import java.util.Scanner;

public class StudentsMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        SearchStudent data = new SearchStudent();
        int amountStudents = 5;

        System.out.println("-------------------------------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for(int i = 0; i < amountStudents; i++) {
            System.out.println("--------");
            System.out.print("NIM\t:");
            int nim = s.nextInt();

            System.out.print("Name\t:");
            String name = s1.nextLine();

            System.out.print("Age\t:");
            int age = s.nextInt();

            System.out.print("GPA\t:");
            double gpa =s.nextDouble();

            Students std = new Students(nim, age, name, gpa);
            data.add(std);
        }
        System.out.println("==============================================");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("==============================================");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("_____________________");
        System.out.println("_____________________");
        System.out.print(" Search student by NIM: ");
        int search = s.nextInt();
        System.out.println("Using Squential Search");
        int position = data.findSeqSearch(search);

        data.showPosition(search, position);

        data.showData(search, position);
    }
    
}
