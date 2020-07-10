package Decorator;

/**
 *
 * @author hanif
 */
public class Main {

    public static void main(String[] args) {
        
        // Create new milk tea
        BubbleTea boba = new MilkTea();
        System.out.println(boba.getDescription() + "\nCost : Rp " + boba.getCost() + "\n");
        
        // Create new brown sugar
        BubbleTea boba2 = new BrownSugar();
        
        // Additional bubble topping
        boba2 = new Bubble(boba2);
        System.out.println(boba2.getDescription() + "\nCost : Rp " + boba2.getCost() + "\n");        
    }
    
}
