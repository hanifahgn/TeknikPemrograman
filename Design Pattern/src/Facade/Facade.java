package Facade;

/**
 *
 * @author hanif
 */
public class Facade {
    
    private AgentProperty apartment;
    private AgentProperty bungalow;
    private AgentProperty condominium;
    
    public Facade() {
        apartment = new Apartment();
        bungalow = new Bungalow();
        condominium = new Condominium();
    }
    
    public void apartmentSale() {
        apartment.houseType();
        apartment.price();
    }
    
    public void bungalowSale() {
        bungalow.houseType();
        bungalow.price();
    }
    
    public void condominiumSale() {
        condominium.houseType();
        condominium.price();
    }
}
