package Facade;

public class Apartment implements AgentProperty {
    
    @Override
    public void houseType() {
        System.out.println("Apartment");
    }
    
    @Override
    public void price() {
        System.out.println("US$ 10000\n");
    }
}
