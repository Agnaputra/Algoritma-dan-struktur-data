package UAS;

import java.util.Scanner;

public class MainSistemRental {
    public static LinkedListCustom<BarangRental> barangRentals = new LinkedListCustom<>();
    public static LinkedListCustom<TransaksiRental> transaksiRentals = new LinkedListCustom<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeBarangRentals();

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayBarangRentals();
                    break;
                case 2:
                    processPeminjaman(scanner);
                    break;
                case 3:
                    displayTransaksiRentals();
                    break;
                case 4:
                    sortTransaksiByTNKB();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    public static void initializeBarangRentals() {
        barangRentals.add(new BarangRental("S 4567 YV", "Honda Beat", "Motor", 2017, 25000));
        barangRentals.add(new BarangRental("V 4511 VS", "Honda Vario", "Motor", 2018, 25000));
        barangRentals.add(new BarangRental("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 40000));
        barangRentals.add(new BarangRental("AB 4321 XA", "Toyota Innova", "Mobil", 2019, 40000));
        barangRentals.add(new BarangRental("L 1234 AG", "Toyota Avanza", "Mobil", 2021, 40000));
    }

    public static void displayBarangRentals() {
        System.out.println("Daftar Kendaraan Rental Serba Serbi");
        System.out.println("No TNKB\tNama Kendaraan\tJenis\tTahun\tBiaya Sewa Perjam");
        barangRentals.display();
    }

    public static void processPeminjaman(Scanner scanner) {
        scanner.nextLine(); // consume newline
        System.out.print("Masukkan Nama Peminjam: ");
        String namaPeminjam = scanner.nextLine();
        System.out.print("Masukkan Nomor TNKB: ");
        String noTNKB = scanner.nextLine();
        System.out.print("Masukkan Lama Pinjam (jam): ");
        int lamaPinjam = scanner.nextInt();

        BarangRental br = findBarangRentalByTNKB(noTNKB);
        if (br != null) {
            TransaksiRental tr = new TransaksiRental(namaPeminjam, lamaPinjam, br);
            transaksiRentals.add(tr);
            System.out.println("Transaksi berhasil ditambahkan!");
        } else {
            System.out.println("Barang dengan nomor TNKB tersebut tidak ditemukan!");
        }
    }

    public static BarangRental findBarangRentalByTNKB(String noTNKB) {
        Node<BarangRental> current = barangRentals.getHead();
        while (current != null) {
            if (current.data.getNoTNKB().equals(noTNKB)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public static void displayTransaksiRentals() {
        System.out.println("Daftar Transaksi Peminjaman Rental Serba Serbi");
        System.out.println("Kode\tNo TNKB\tNama Barang\tNama Peminjam\tLama Pinjam\tTotal Biaya");
        transaksiRentals.display();
    }

    public static void sortTransaksiByTNKB() {
        transaksiRentals.sort((tr1, tr2) -> tr1.getBarangRental().getNoTNKB().compareTo(tr2.getBarangRental().getNoTNKB()));
        displayTransaksiRentals();
    }
}
