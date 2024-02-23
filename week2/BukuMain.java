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

    buku01 bk2 = new buku01("Self Reward", "Maheera Ayesha", 160, 29, 59000);
    bk2.terjual(11);
    bk2.tampilInformasi();

    buku01 bukuAgna = new buku01("The Art of Problem Solving", "Denanda Pratiwi", 300, 20, 120000);
    bukuAgna.terjual(10);
    bukuAgna.tampilInformasi();
    }

}
