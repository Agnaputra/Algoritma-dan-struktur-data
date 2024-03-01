package week3;

public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs[] = new Mahasiswa[3];
        double sum = 0;
        double maxIPK = Double.MIN_VALUE;
        Mahasiswa maxIPKStudent = null;

        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa("NIM" + i, "NAMA" + i, "L", Math.random() * 4 + 1); // Assuming GPA range is from 1 to 4
            mhs[i].print();
            sum = sum + mhs[i].getIPK();

            if (mhs[i].getIPK() > maxIPK) {
                maxIPK = mhs[i].getIPK();
                maxIPKStudent = mhs[i];
            }
        }
        double rata2 = sum / mhs.length;
        System.out.println("IPK rata2 = " + rata2);

        System.out.println("\nStudent with the highest GPA:");
        maxIPKStudent.print();
    }
}