package Strategy;

/**
 *
 * @author hanif
 */

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Context context;
        int a, b;
       
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter two numbers : ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();

        System.out.println("\nChoose operation");
        System.out.println("1 - Addition");
        System.out.println("2 - Substraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("Enter your choice : ");
        int input = keyboard.nextInt();

        switch (input) {
            case 1 :
                context = new Context(new Addition());
                System.out.println("\n" + a + " + " + b + " = " + context.executeStrategy(a, b) + "\n");
                break;

            case 2 :
                context = new Context(new Substraction());
                System.out.println("\n" + a + " - " + b + " = " + context.executeStrategy(a, b) + "\n");
                break;

            case 3 :
                context = new Context(new Multiplication());
                System.out.println("\n" + a + " x " + b + " = " + context.executeStrategy(a, b) + "\n");
                break;

            case 4 :
                context = new Context(new Division());
                System.out.println("\n" + a + " / " + b + " = " + context.executeStrategy(a, b) + "\n");
                break;
        }   
    }
}
