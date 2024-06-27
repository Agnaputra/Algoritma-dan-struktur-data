package UAS;
//class
public class TransaksiRental {
    public static int kodeCounter = 1;
    public int kodeTransaksi;
    public String namaPeminjam;
    public int lamaPinjam;
    public double totalBiaya;
    public BarangRental br;

    public TransaksiRental(String namaPeminjam, int lamaPinjam, BarangRental br) {
        this.kodeTransaksi = kodeCounter++;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.br = br;
        this.totalBiaya = calculateTotalBiaya();
    }
    //Constructor
    public double calculateTotalBiaya() {
        double biaya = br.getBiayaSewaPerjam() * lamaPinjam;

        if (isMember(namaPeminjam)) {
            biaya -= 25000;
        }

        if (lamaPinjam >= 48 && lamaPinjam <= 78) {
            biaya *= 0.9;
        } else if (lamaPinjam > 78) {
            biaya *= 0.8;
        }

        return biaya;
    }

    public boolean isMember(String namaPeminjam) {
        return namaPeminjam.endsWith("i");
    }

    public int getKodeTransaksi() {
        return kodeTransaksi;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public BarangRental getBarangRental() {
        return br;
    }

    @Override
    public String toString() {
        return kodeTransaksi + "\t" + br.getNoTNKB() + "\t" + br.getNamaKendaraan() + "\t" + namaPeminjam + "\t" + lamaPinjam + "\t" + totalBiaya;
    }
}
