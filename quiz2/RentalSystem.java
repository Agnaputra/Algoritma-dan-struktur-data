package quiz2;

import java.util.Scanner;

class BarangRental {
    String noTNKB;
    String namaKendaraan;
    String jenisKendaraan;
    int tahun;
    int biayaSewa;

    BarangRental(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa) {
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
    }
}

class TransaksiRental {
    static int autoIncrement = 1;
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    BarangRental br;

    TransaksiRental(String namaPeminjam, int lamaPinjam, BarangRental br) {
        this.kodeTransaksi = autoIncrement++;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.br = br;
        this.totalBiaya = calculateTotalBiaya();
    }

    double calculateTotalBiaya() {
        double biaya = lamaPinjam * br.biayaSewa;
        if (lamaPinjam >= 48 && lamaPinjam <= 78) {
            biaya *= 0.9;
        } else if (lamaPinjam > 78) {
            biaya *= 0.8;
        }
        return biaya;
    }
}

class NodeBarangRental {
    BarangRental data;
    NodeBarangRental prev, next;

    NodeBarangRental(BarangRental data) {
        this.data = data;
    }
}

class NodeTransaksiRental {
    TransaksiRental data;
    NodeTransaksiRental prev, next;

    NodeTransaksiRental(TransaksiRental data) {
        this.data = data;
    }
}

class DoubleLinkedListBarangRental {
    NodeBarangRental head, tail;

    void add(BarangRental br) {
        NodeBarangRental newNode = new NodeBarangRental(br);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    BarangRental find(String noTNKB) {
        NodeBarangRental current = head;
        while (current != null) {
            if (current.data.noTNKB.equalsIgnoreCase(noTNKB)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    void display() {
        System.out.println("===================================");
        System.out.println("Daftar Kendaraan Rental Serba Serbi");
        System.out.println("===================================");
        System.out.printf("| %-10s | %-15s | %-10s | %-6s | %-15s |\n", "No TNKB", "Nama Kendaraan", "Jenis", "Tahun", "Biaya Sewa Perjam");
        NodeBarangRental current = head;
        while (current != null) {
            BarangRental br = current.data;
            System.out.printf("| %-10s | %-15s | %-10s | %-6d | %-15d |\n", br.noTNKB, br.namaKendaraan, br.jenisKendaraan, br.tahun, br.biayaSewa);
            current = current.next;
        }
    }
}

class DoubleLinkedListTransaksiRental {
    NodeTransaksiRental head, tail;

    void add(TransaksiRental tr) {
        NodeTransaksiRental newNode = new NodeTransaksiRental(tr);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void display() {
        System.out.println("===================================");
        System.out.println("Transaksi Rental Serba Serbi");
        System.out.println("===================================");
        System.out.printf("| %-5s | %-10s | %-15s | %-15s | %-10s | %-10s |\n", "Kode", "No TNKB", "Nama Barang", "Nama Peminjam", "Lama Pinjam", "Total Biaya");
        double totalPendapatan = 0;
        NodeTransaksiRental current = head;
        while (current != null) {
            TransaksiRental tr = current.data;
            System.out.printf("| %-5d | %-10s | %-15s | %-15s | %-10d | %-10.2f |\n", tr.kodeTransaksi, tr.br.noTNKB, tr.br.namaKendaraan, tr.namaPeminjam, tr.lamaPinjam, tr.totalBiaya);
            totalPendapatan += tr.totalBiaya;
            current = current.next;
        }
        System.out.println("Total pendapatan hari ini: " + totalPendapatan);
    }
}

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

    static void initKendaraan
