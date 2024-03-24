package week6;

public class StudentList {
    Student list[] = new Student[5];
    int idx;

    //add method
    void add(Student std) {
        if (idx<list.length){
            list[idx] = std;
            idx++;
        }else{
            System.out.println("The student list is alredy full-filled");
        }  
    }
    //print method    
    void print() {
        for(Student s: list){
            s.print();
            System.out.println("==============================================================");
        }
    }
    //bubble sort method
     void bubbleSort(){
        for(int i=0; i<list.length-1; i++){
            for(int j=1; j<list.length-i; j++){
                if(list [j].gpa > list [j-1].gpa){
                    //swap
                    Student tmp = list [j];
                    list [j] = list [j-1];
                    list [j-1] = tmp;
                }
            }
        }
    }/* */
    /*//selection short method
    void selectionSort() {
        for(int i=0; i<list.length-1; i++) {
            int idxMin = i;
            for(int j=i+1; j<list.length; j++){
                if(list[j].gpa.)
            }
        }
    }/* */
}
