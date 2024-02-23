package week1;

import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] matkul = {"Algoritma", "Kalkulus", "Fisika", "Pemrograman"};
        int[] sks = {3, 4, 3, 4}; 
        double[] nilai = new double[matkul.length];
        
        double totalNilai = 0;
        double totalSks = 0;
        
        for(int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai " + matkul[i] + ": ");
            String nh = input.next();
            
            switch(nh) {
                case "A":
                    nilai[i] = 4; 
                    break;
                case "B":
                    nilai[i] = 3;
                    break;
                case "C":
                    nilai[i] = 2;
                    break;
                case "D":
                    nilai[i] = 1;
                    break;
                default:
                    nilai[i] = 0;
            }
            
            totalNilai += nilai[i] * sks[i];
            totalSks += sks[i];
        }
        
        double ipSemester = totalNilai / totalSks;
        
        System.out.println("IP Semester: " + ipSemester);
    }
}
