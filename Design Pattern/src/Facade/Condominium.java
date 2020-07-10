package Facade;

/**
 *
 * @author hanif
 */
public class Condominium implements AgentProperty {
    
    @Override
    public void houseType() {
        System.out.println("Condominium ");
    }
    
    @Override
    public void price() {
        System.out.println("US$ 7000\n");
    }
}
