/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author hanif
 */
public class RealTuitionReduction implements TuitionReduction {
    
    private String studentName;
    
    public RealTuitionReduction(String studentName) {
        this.studentName = studentName;
    }
    
    @Override
    public void grantStudentRequest() {
        System.out.println("Tuition reduction request is granted for student : " + studentName);
    }
}
