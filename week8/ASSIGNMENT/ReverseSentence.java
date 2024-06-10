package week8.ASSIGNMENT;
import java.util.Scanner;
public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        Stack stack = new Stack(sentence.length());
        
        for (char c : sentence.toCharArray()) {
            stack.push(c);
        }
        
        System.out.print("Reversed sentence: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}