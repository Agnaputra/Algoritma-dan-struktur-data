package quizzz;

public class Patient {
    String name;
    int age;
    int[] medicationPrice = new int[3];
    int doctorFee;

    // Constructor
    public Patient(String na, int age, int[] MP, int DF) {
        name = na;
        age = age;
        medicationPrice = MP;
        doctorFee = DF;
    
    }

    void print() {
        System.out.println("Nama = " + name);
        System.out.println("Age = " + age);
        System.out.println("MedicationPrice = " + medicationPrice);
        System.out.println("DoctorFee = " + doctorFee);     
    }
    
}
