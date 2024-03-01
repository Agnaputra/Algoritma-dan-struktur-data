package week3;

public class ArrayOfTriangle {
    public static void main(String[] args) {
        // Instantiate array of Triangle objects
        Triangle[] trArray = new Triangle[4];

        // Assign attribute values to each Triangle object
        trArray[0] = new Triangle(10, 4);
        trArray[1] = new Triangle(20, 10);
        trArray[2] = new Triangle(15, 6);
        trArray[3] = new Triangle(25, 10);

        // Display the result of area and perimeter for each triangle
        for (int i = 0; i < trArray.length; i++) {
            System.out.println("Triangle " + i + " Area: " + trArray[i].countArea());
            System.out.println("Triangle " + i + " Perimeter: " + trArray[i].countPerimeter());
        }
    }
}

