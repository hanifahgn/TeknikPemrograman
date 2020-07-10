package Proxy;

/**
 *
 * @author hanif
 */
public class Main {

    public static void main(String[] args) {
        
        TuitionReduction request = new ProxyTuitionReduction("Dini Nasya", 71);
        request.grantStudentRequest();
    }
    
}
