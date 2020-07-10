package Facade;

/**
 *
 * @author hanif
 */
public class Main {
    
    public static void main(String[] args) {
        
        Facade f = new Facade();
        
        f.apartmentSale();
        f.bungalowSale();
        f.condominiumSale();
    }
}
