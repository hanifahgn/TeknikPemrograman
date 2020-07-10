package Decorator;

/**
 *
 * @author hanif
 */
public class Coffee extends BubbleTea {
    
    public Coffee() {
        description = "Coffee";
    }
    
    public int getCost() {
        return 20000;
    }
}
