package week3;

public class Triangle {
    public int base;
    public int height;

    // First constructor
    public Triangle() {
        base = 0;
        height = 0;
    }

    // Second constructor with parameters (overloaded constructor)
    public Triangle(int b, int h) {
        base = b;
        height = h;
    }

    // Method to calculate the area of the triangle
    public double countArea() {
        return 0.5 * base * height;
    }

    // Method to calculate the perimeter of the triangle (assuming it's an equilateral triangle)
    public double countPerimeter() {
        return 3 * base;
    }
}

