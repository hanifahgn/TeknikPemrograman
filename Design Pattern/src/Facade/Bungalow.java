package Facade;

/**
 *
 * @author hanif
 */
public class Bungalow implements AgentProperty {
    
    @Override
    public void houseType() {
        System.out.println("Bungalow");
    }
    
    @Override
    public void price() {
        System.out.println("US$ 14000\n");
    }
}
