
package Decorator;

/**
 *
 * @author hanif
 */
public abstract class BubbleTea {
    
    String description = "Unknown bubble tea";
    
    public String getDescription() {
        return description;
    }
    
    public abstract int getCost();
}
