package week5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("============================================");
        System.out.println("Program for Calculating Total Profits");
        System.out.println("Input the Number of Month : ");
        int totElemen = sc.nextInt();
        Sum sm = new Sum(totElemen);
        sm.elemen = totElemen;

        System.out.println("============================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Input the profit of the month to - "+(i+1)+" = ");
            sm.profit[i] = sc.nextDouble();   
        }
        System.out.println("============================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total profits of the company for " + sm.elemen + " month is = "
                +sm.totalBF(sm.profit));
        System.out.println("============================================");
        System.out.println("Algoritma Divine Conquer");
        System.out.println("Total profits of the company for " + sm.elemen + " month is = "
                +sm.totalDC(sm.profit, 0, sm.elemen-1));/* */
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number of companies: ");
                int numCompanies = sc.nextInt();
                
                Sum[] companies = new Sum[numCompanies];
                
                for (int i = 0; i < numCompanies; i++) {
                    System.out.println("Enter the number of months for company " + (i+1) + ": ");
                    int totElemen = sc.nextInt();
                    companies[i] = new Sum(totElemen);
                    companies[i].elemen = totElemen;
                    
                    System.out.println("Input the profits for company " + (i+1) + ": ");
                    for (int j = 0; j < companies[i].elemen; j++) {
                        System.out.print("Input the profit of month " + (j+1) + ": ");
                        companies[i].profit[j] = sc.nextDouble();
                    }
                }
                
                System.out.println("============================================");
                for (int i = 0; i < numCompanies; i++) {
                    System.out.println("Company " + (i+1) + " Profits:");
                    System.out.println("Algoritma Brute Force");
                    System.out.println("Total profits for " + companies[i].elemen + " months: "
                                       + companies[i].totalBF(companies[i].profit));
                    System.out.println("Algoritma Divide Conquer");
                    System.out.println("Total profits for " + companies[i].elemen + " months: "
                                       + companies[i].totalDC(companies[i].profit, 0, companies[i].elemen-1));
                    System.out.println("============================================");
                }
            }           
    }
    

