package Decorator;

/**
 *
 * @author hanif
 */
public class Pudding {
    
    BubbleTea bubbleTea;
    
    public Pudding(BubbleTea bubbleTea) {
        this.bubbleTea = bubbleTea;
    }
    
    public String getDescription() {
        return bubbleTea.getDescription() + " + Pudding ";
    }
    
    public int getCost() {
        return 4000 + bubbleTea.getCost();
    }
}
