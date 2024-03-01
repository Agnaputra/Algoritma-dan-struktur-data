package week1;

public class Tugas3 {
    public static void main(String[] args) {
        //input score
        //create scanner, declare n instantiate array, loop over array to get input
        int[] courseScore = {75,85,70,85,85,62,62,85};

        //input sks
        int[] credit = {2,3,2,2,2,3,2,3};
        
        //convert score to letter
        String[] letterScore = new String[courseScore.length];
        for(int i=0;i<letterScore.length;i++){
            letterScore[i] = letterConversion(courseScore[i]);
        }
        for(String letter:letterScore){
            System.out.print(letter+" ");
        }
        System.out.println();

        //convert letter to weight
        double[] weightScore = new double[courseScore.length];
        for(int i=0;i<weightScore.length;i++){
            weightScore[i] = weightConversion(letterScore[i]);
        }
        for(double weight:weightScore){
            System.out.print(weight+" ");
        }
        System.out.println();

        //calc GPA
        double gpa=0, sumCredit=0, sumScore=0;
        for(int i=0;i<weightScore.length;i++){
            sumCredit += credit[i];
            sumScore += credit[i]*weightScore[i];
        }
        gpa = sumScore/sumCredit;
        System.out.println(gpa);
    }
    static String letterConversion(double finalGrade){
        String result = "";
        if (finalGrade > 80 && finalGrade <= 100){
            result = "A";
        }else if (finalGrade > 73 && finalGrade <= 80 ){
            result = "B+";
        }else if (finalGrade  > 65 && finalGrade <= 73){
            result = "B";
        }else if (finalGrade > 60 && finalGrade <= 65){
            result = "C+";
        }else if (finalGrade > 50 && finalGrade <= 60){
            result = "C";
        }else if (finalGrade > 39 && finalGrade <= 60){
            result = "D";
        }else{
            result = "E";
        }
        return result;
    }
    static double weightConversion(String letterScore){
        double result = 0;
        switch(letterScore){
            case "A" : result = 4; break;
            case "B+" : result = 3.5; break;
            case "B" : result = 3; break;
            case "C+" : result = 2.5; break;
            case "C" : result = 2; break;
            case "D" : result = 1; break;
            default : result = 0; break;
        }
        return result;
    }
   
}
