package week2;
import java.util.Scanner;
public class BukuMain {
    public static void main(String[] args) {
     buku01 bk1 = new buku01();
     bk1.judul = "Today Ends Tomorrow Comes";
     bk1.pengarang = "Denada Pratiwi";
     bk1.halaman = 198;
     bk1.stok = 13;
     bk1.harga = 71000;
     
     bk1.tampilInformasi();
     bk1.terjual(5);
     bk1.gantiHarga(60000);
     bk1.tampilInformasi();
     System.out.println("Harga yang terjual + "+bk1.hitungHargaTotal(5));
     System.out.println("Diskon = "+ bk1.hitungDiskon(5));
     System.out.println("Bayar ="+ bk1.hitungHargaBayar(5));
     System.out.println("=======================================");

    buku01 bk2 = new buku01("Self Reward", "Maheera Ayesha", 160, 29, 59000);
    bk2.terjual(11);
    bk2.tampilInformasi();
    System.out.println("Harga yang terjual + "+bk2.hitungHargaTotal(11));
    System.out.println("Diskon = "+ bk2.hitungDiskon(11));
    System.out.println("Bayar ="+ bk2.hitungHargaBayar(11));
    System.out.println("=======================================");

    buku01 bukuAgna = new buku01("The Art of Problem Solving", "Denanda Pratiwi", 300, 20, 120000);
    bukuAgna.terjual(10);
    bukuAgna.tampilInformasi();
    System.out.println("Harga yang terjual + "+bukuAgna.hitungHargaTotal(10));
    System.out.println("Diskon = "+ bukuAgna.hitungDiskon(10));
    System.out.println("Bayar ="+ bukuAgna.hitungHargaBayar(10));
    System.out.println("=======================================");
    }

}
