package week8;

import java.util.Scanner;

public class PostfixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert mathematical expression (infix): ");
        String exp = sc.nextLine();

        Postfix pf = new Postfix(exp.length());
        String postfix = pf.infixToPostfix(exp);

        System.out.println("Postfix: " + postfix);

        System.out.print("Do you want to evaluate the postfix expression (y/n)? ");
        char choice = sc.next().charAt(0);

        if (choice == 'y' || choice == 'Y') {
            int result = pf.evaluatePostfix(postfix);
            System.out.println("Result of postfix evaluation: " + result);
        }

        sc.close();
    }
}

