package week3;

public class Patient01 {
    String name;
    int age;
    int[] medicationPrice;
    int doctorFee;

    // Constructor
    public Patient01(String na, int a, int[] MP, int DF) {
        name = na;
        age = a;
        medicationPrice = MP;
        doctorFee = DF;
    }

    // Method to calculate average medication price
    public double averageMedicationPrice() {
        int sum = 0;
        for (int price : medicationPrice) {
            sum += price;
        }
        return (double) sum / medicationPrice.length;
        
    }

    // Method to calculate total fee
    public double totalFee() {
        return doctorFee + averageMedicationPrice();
    }

    // Method to print patient data
    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Medication Prices: ");
        for (int price : medicationPrice) {
            System.out.print(price + " ");
        }
        System.out.println("averagemedicationprice: " + averageMedicationPrice());
        System.out.println("\nDoctor Fee: " + doctorFee);
        System.out.println("Totalfee: " + totalFee());
    }
}


