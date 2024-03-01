package week3;

public class Mahasiswa {
    String nim, nama, jenisKelamin;
    double IPK;

    Mahasiswa(String ni, String na, String jk, double ipk) {
        nim = ni;
        nama = na;
        jenisKelamin = jk;
        IPK = ipk;
    }

    void print() {
        System.out.println("NIM = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Jenis Kelamin = " + jenisKelamin);
        System.out.println("IPK = " + IPK);
    }

    double getIPK() {
        return IPK;
    }
}