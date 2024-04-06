package week7;

public class SearchStudent {
    Students [] listStd = new Students[5];
    int idx;

    public SearchStudent(int size) {
        listStd = new Students[size];
        idx = 0;
    }
    
    public void add(Students std) {
        if(idx < listStd.length) {
            listStd[idx] = std;
            idx++;

        }else{
            System.out.println("Data is already full");
        }
    }
    public void display() {
        for (Students students : listStd) {
            students.display();
            System.out.println("==============================================");
            
        }
    }
    //Squential Search
    public int findSeqSearch(String search) {
        int position = -1;
        for (int i = 0; i < listStd.length; i++) {
            if(listStd[i].name.equals(search)) {
                position = i;
                break;
            }
        }
        return position;
    }
    //Binary search
    public int findBinarySearch(int cari, int left, int right) {
        sort();
        int mid;
        if (right >=left ) {
            mid = (left + right) /2;
            if (cari == listStd[mid].nim) {
                return (mid);

            }else if (listStd[mid].nim < cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    private void sort() {
        for (int i = 0; i < listStd.length - 1; i++) {
            for (int j = 0; j < listStd.length - i - 1; j++) {
                if (listStd[j].nim > listStd[j+1].nim) {
                    Students temp = listStd[j];
                    listStd[j] = listStd[j+1];
                    listStd[j+1] = temp;
                }
            }
        }
    }
    public void showPosition(String name, int pos) {
        if(pos != -1) {
            System.out.println("Data : " + name + " is found in index-"+pos);
        }else{
            System.out.println("Data : " + name + " is not found");
        }
    }
    public void showData(String name, int pos) {
        if(pos != -1) {
            System.out.println("Name \t : " + name);
            System.out.println("NIM \t : " + listStd[pos].nim);
            System.out.println("Age \t : " + listStd[pos].age);
            System.out.println("IPK \t : " + listStd[pos].gpa);
        }else{
            System.out.println("Data " + name + "is not found");
        }
    }

    

}

