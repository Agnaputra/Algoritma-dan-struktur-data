package UAS;
//Class
public class BarangRental {
    public String noTNKB;
    public String namaKendaraan;
    public String jenis;
    public int tahun;
    public double biayaSewaPerjam;

    public BarangRental(String noTNKB, String namaKendaraan, String jenis, int tahun, double biayaSewaPerjam) {
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenis = jenis;
        this.tahun = tahun;
        this.biayaSewaPerjam = biayaSewaPerjam;
    }
    //Constructor
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
}
