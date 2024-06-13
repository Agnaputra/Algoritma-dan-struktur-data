package quizzz;
import java.util.Scanner;
public class RentalSystem {
    static DoubleLinkedListBarangRental daftarKendaraan = new DoubleLinkedListBarangRental();
    static DoubleLinkedListTransaksiRental daftarTransaksi = new DoubleLinkedListTransaksiRental();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initKendaraan();
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    daftarKendaraan.display();
                    break;
                case 2:
                    peminjaman();
                    break;
                case 3:
                    daftarTransaksi.display();
                    break;
                case 4:
                    urutkanTransaksi();
                    break;
                case 5:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 5);
    }

    static void displayMenu() {
        System.out.println("\nMenu");
        System.out.println("1. Daftar Kendaraan");
        System.out.println("2. Peminjaman");
        System.out.println("3. Tampilkan seluruh transaksi");
        System.out.println("4. Urutkan Transaksi urut no TNKB");
        System.out.println("5. Keluar");
        System.out.print("Pilih(1-5): ");
    }

    static void initKendaraan() {
        daftarKendaraan.add(new BarangRental("S 4567 VV", "Honda Beat", "Motor", 2017, 10000));
        daftarKendaraan.add(new BarangRental("N 4511 VS", "Honda Vario", "Motor", 2018, 10000));
        daftarKendaraan.add(new BarangRental("IN 1353 AA", "Toyota Yaris", "Mobil", 2022, 30000));
        daftarKendaraan.add(new BarangRental("AB 4321 AI", "Toyota Innova", "Mobil", 2019, 60000));
        daftarKendaraan.add(new BarangRental("B 1234 AG", "Toyota Avanza", "Mobil", 2021, 25000));
    }

    static void peminjaman() {
        System.out.print("Masukkan Nama Peminjam: ");
        String namaPeminjam = scanner.nextLine();
        System.out.print("Masukkan No TNKB: ");
        String noTNKB = scanner.nextLine();
        System.out.print("Masukkan Lama Pinjam (jam): ");
        int lamaPinjam = scanner.nextInt();

        BarangRental br = daftarKendaraan.find(noTNKB);
        if (br != null) {
            if (lamaPinjam > 0) {
                TransaksiRental tr = new TransaksiRental(namaPeminjam, lamaPinjam, br);
                daftarTransaksi.add(tr);
                System.out.println("Transaksi berhasil dilakukan!");
            } else {
                System.out.println("Lama pinjam harus lebih dari 0 jam.");
            }
        } else {
            System.out.println("Tidak ada kendaraan dengan no TNKB tersebut atau sedang dipinjam.");
        }
    }

    static void urutkanTransaksi() {
        System.out.print("Pilih urutan (1: Nama A-M, 2: Nama N-Z): ");
        int urutan = scanner.nextInt();
        scanner.nextLine(); // consume newline

        daftarTransaksi.sort(urutan);
        daftarTransaksi.display();
    }
}

