package week5;

import java.util.Scanner;

public class MainSquared {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================");
        System.out.print("Input the number of elements you want to count : ");
        int elemen = sc.nextInt();

        Squared[] png = new Squared[elemen];

        System.out.println("Choose the method to run:");
        System.out.println("1. SquaredBF");
        System.out.println("2. SquaredDC");

        int choice = sc.nextInt();

        for (int i = 0; i < elemen; i++) {
            System.out.print("Input the value to be squared for element " + i + " : ");
            int value = sc.nextInt();
            png[i] = new Squared(value);
        }

        System.out.println("============================================");
        switch (choice) {
            case 1:
                System.out.println("Result with Brute Force Squared");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Value " + png[i].a + " squared is : "
                            + png[i].squaredBF(png[i].a));
                }
                break;
            case 2:
                System.out.println("Result with Divide and Conquer Squared");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Value " + png[i].a + " squared is : "
                            + png[i].squaredDC(png[i].a));
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
       /*  System.out.println("============================================");
        System.out.print("Input the number of elements you want to count : ");
        int elemen = sc.nextInt();

        Squared [] png = new Squared[elemen];

        for (int i = 0; i < elemen; i++) {
            png[i] = new Squared();
            System.out.print("Input the value to be squared to-"+(i+i)+" : ");
            png[i].num = sc.nextInt();
            System.out.print("Input the squared value to-"+(i+i)+" : ");
            png[i].squared =sc.nextInt();
        }
        System.out.println("============================================");
        System.out.println("Result with Brute Force Squared");
        for (int i = 0; i < elemen; i++){
            System.out.println("Value "+png[i].num+" squared "+png[i].squared+" is : "
            +png[i].squaredBF(png[i].num,png[i].squared));
        }
        System.out.println("============================================");
        System.out.println("Result with Divie and Conquer squared");
        for (int i = 0; i < elemen; i++){
            System.out.println("Value "+png[i].num+" squared "+png[i].squared+" is : "
            +png[i].squaredDC(png[i].num,png[i].squared));
        }/* */
        System.out.println("============================================");
    }
    
}
