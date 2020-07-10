package Decorator;

/**
 *
 * @author hanif
 */
public class GrassJelly {
    
    BubbleTea bubbleTea;
    
    public GrassJelly(BubbleTea bubbleTea) {
        this.bubbleTea = bubbleTea;
    }
    
    public String getDescription() {
        return bubbleTea.getDescription() + " + Grass Jelly ";
    }
    
    public int getCost() {
        return 4000 + bubbleTea.getCost();
    }
}
