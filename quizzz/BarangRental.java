package quizzz;

import java.util.Objects;

public class BarangRental {
    private String noTNKB;
    private String namaKendaraan;
    private String jenis;
    private int tahun;
    private double biayaSewaPerjam;

    public BarangRental(String noTNKB, String namaKendaraan, String jenis, int tahun, double biayaSewaPerjam) {
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenis = jenis;
        this.tahun = tahun;
        this.biayaSewaPerjam = biayaSewaPerjam;
    }

    public String getNoTNKB() {
        return noTNKB;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public String getJenis() {
        return jenis;
    }

    public int getTahun() {
        return tahun;
    }

    public double getBiayaSewaPerjam() {
        return biayaSewaPerjam;
    }

    @Override
    public String toString() {
        return noTNKB + "\t" + namaKendaraan + "\t" + jenis + "\t" + tahun + "\t" + biayaSewaPerjam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BarangRental that = (BarangRental) o;
        return Objects.equals(noTNKB, that.noTNKB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noTNKB);
    }
}
