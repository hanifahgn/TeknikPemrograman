package Decorator;

/**
 *
 * @author hanif
 */
public class MilkTea extends BubbleTea {
    
    public MilkTea() {
        description = "Milk tea";
    }
    
    public int getCost() {
        return 20000;
    }
}
