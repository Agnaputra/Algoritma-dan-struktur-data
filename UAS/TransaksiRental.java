package UAS;

public class TransaksiRental {
    private static int kodeCounter = 1;
    private int kodeTransaksi;
    private String namaPeminjam;
    private int lamaPinjam;
    private double totalBiaya;
    private BarangRental br;

    public TransaksiRental(String namaPeminjam, int lamaPinjam, BarangRental br) {
        this.kodeTransaksi = kodeCounter++;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.br = br;
        this.totalBiaya = calculateTotalBiaya();
    }

    private double calculateTotalBiaya() {
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

    private boolean isMember(String namaPeminjam) {
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
