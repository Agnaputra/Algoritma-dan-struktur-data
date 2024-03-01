import week3.Rectangle;

public class ArrayOfObject {
    public static void main(String[] args) {
        Rectangle[] rectangleArray = new Rectangle[3];
        
        rectangleArray[0] = new Rectangle();
        rectangleArray[0].lenght = 110;
        rectangleArray[0].widht = 30;
        
        rectangleArray[1] = new Rectangle();
        rectangleArray[1].lenght = 80;
        rectangleArray[1].widht = 40;

        rectangleArray[2] = new Rectangle();
        rectangleArray[2].lenght = 100;
        rectangleArray[2].widht = 20;

        System.out.println("First rectangle, width: " + rectangleArray[0].widht + ", lenght: " + rectangleArray[0].lenght);
        System.out.println("Second rectangle, width: " + rectangleArray[0].widht + ", lenght: " + rectangleArray[0].lenght);

    }    
}
