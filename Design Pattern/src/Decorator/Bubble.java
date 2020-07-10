package Decorator;

/**
 *
 * @author hanif
 */
public class Bubble extends Topping {
    
    BubbleTea bubbleTea;
    
    public Bubble(BubbleTea bubbleTea) {
        this.bubbleTea = bubbleTea;
    }
    
    public String getDescription() {
        return bubbleTea.getDescription() + " + Bubble ";
    }
    
    public int getCost() {
        return 4000 + bubbleTea.getCost();
    }
}
