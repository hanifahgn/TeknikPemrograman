package Proxy;

/**
 *
 * @author hanif
 */
public class ProxyTuitionReduction implements TuitionReduction {
    
    private String studentName;
    private int averageScore;
    private RealTuitionReduction realReduction;
    
    public ProxyTuitionReduction(String studentName, int averageScore) {
        this.studentName = studentName;
        this.averageScore = averageScore;
    }
    
    @Override
    public void grantStudentRequest() {
        if (getAverageScore(studentName) > 70) {
            realReduction = new RealTuitionReduction(studentName);
            realReduction.grantStudentRequest();
            
        } else {
            System.out.println("Request cannot be granted, your average score is below 70");
        }
    }
    
    public int getAverageScore(String studentName) {
        return averageScore;
    }
}
