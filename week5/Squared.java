package week5;
   
public class Squared {
    public int a;
    
    // Constructor to initialize 'a'
    public Squared(int a) {
        this.a = a;
    }

    // Brute Force method to calculate square
    public int squaredBF(int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * a;
        }
        return result;
    }

    // Divide and Conquer method to calculate square
    public int squaredDC(int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) // Odd
                return (squaredDC(n / 2) * squaredDC(n / 2) * a);
            else // Even
                return (squaredDC(n / 2) * squaredDC(n / 2));
        }
    /*public int num,squared;

    public int squaredBF(int a, int n) {
        int result=1;
        for (int i = 0; i < n; i++) {
            result = result * a;
        }
        return result;
    }
    public int squaredDC(int a, int n) {
        if (n==0) {
            return 1;
        }
        else
        {
            if(n%2==1) //ood
                return (squaredDC (a,n/2)*squaredDC(a,n/2)*a);
            else //even
                return (squaredDC (a,n/2)*squaredDC(a,n/2));
        }
    }/* */
    
    }
}
