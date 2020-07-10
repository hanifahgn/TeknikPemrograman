package Singleton;

/**
 *
 * @author hanif
 */
public class Singleton {
    
    private static Singleton s = null;
    
    private Singleton() {
        
    }
        
    public static Singleton getInstance() {
        if (s == null) {
            s = new Singleton();
        }
        
        return s;
    }    
    
    public static void testing() {
        System.out.println("Testing method singleton");
    }
    
}
