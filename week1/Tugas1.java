package week1;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double tugas, kuis, uts, uas, nilaiAkhir;
        
        System.out.print("Masukkan nilai tugas: ");
        tugas = input.nextDouble();
        if(tugas < 0 || tugas > 100){
            System.out.println("Nilai tidak valid");
            return;
        }
        
        System.out.print("Masukkan nilai kuis: ");  
        kuis = input.nextDouble();
        if(kuis < 0 || kuis > 100){
            System.out.println("Nilai tidak valid");
            return;
        }
        
        System.out.print("Masukkan nilai UTS: ");
        uts = input.nextDouble();
        if(uts < 0 || uts > 100){
            System.out.println("Nilai tidak valid");
            return;  
        }
        
        System.out.print("Masukkan nilai UAS: ");
        uas = input.nextDouble();
        if(uas < 0 || uas > 100){
            System.out.println("Nilai tidak valid");
            return;
        }
        System.out.println("=========================");
        nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.4);
        
        if(nilaiAkhir >= 80) {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: A");
            System.out.println("Keterangan: LULUS");
        }
        else if(nilaiAkhir >= 68) {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: B+");  
            System.out.println("Keterangan: LULUS");
        }
        else if(nilaiAkhir >= 56) {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: B");
            System.out.println("Keterangan: LULUS");
        }
        else if(nilaiAkhir >= 45) {
            System.out.println("Nilai akhir: " + nilaiAkhir); 
            System.out.println("Nilai huruf: C");
            System.out.println("Keterangan: LULUS");  
        }
        else if(nilaiAkhir >= 0) {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: D/E");
            System.out.println("Keterangan: TIDAK LULUS"); 
        
        }
        System.out.println("=========================");
    }
}