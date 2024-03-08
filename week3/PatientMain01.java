package week3;

public class PatientMain01 {
    public static void main(String[] args) {

        // Populate the array with patient objects
        Patient01 p1 = new Patient01("Patient1", 25, new int[]{20000, 30000, 40000}, 50000);
        Patient01 p2 = new Patient01("Patient2", 35, new int[]{25000, 35000, 45000}, 60000);
        Patient01 p3 = new Patient01("Patient3", 55, new int[]{30000, 40000, 50000}, 70000);
        Patient01 sData[] = {p1,p2,p3};
        // Calculate the average of total fee of patients whose age is greater than 50
        double totalFeeSum = 0;
        int count = 0;

        for(Patient01 ptt:sData){
            ptt.printData();
        }
    

        for (Patient01 patient : sData ) {
            if (patient.age > 50) {
                totalFeeSum += patient.totalFee();
                count++;
            }
        }
        double averageTotalFee = totalFeeSum / count;
        System.out.println("Average total fee of patients above 50 years old: " + averageTotalFee);

        // Find the smallest average medication price of 15-30 years old patients
        double smallestAverageMedicationPrice = Double.MAX_VALUE;
        for (Patient01 patient : sData) {
            if (patient.age >= 15 && patient.age <= 30) {
                double avgMedPrice = patient.averageMedicationPrice();
                if (avgMedPrice < smallestAverageMedicationPrice) {
                    smallestAverageMedicationPrice = avgMedPrice;
                }
            }
        }
        System.out.println("Smallest average medication price of 15-30 years old patients: " + smallestAverageMedicationPrice);

        // Find the patient with the smallest medication price
        int smallestMedicationPrice = Integer.MAX_VALUE;
        Patient01 patientWithSmallestMedPrice = null;
        for (Patient01 patient : sData) {
            int medPriceSum = 0;
            for (int price : patient.medicationPrice) {
                medPriceSum += price;
            }
            if (medPriceSum < smallestMedicationPrice) {
                smallestMedicationPrice = medPriceSum;
                patientWithSmallestMedPrice = patient;
            }
        }
        System.out.println("Patient with the smallest medication price:");
        patientWithSmallestMedPrice.printData();

        
    }
}
