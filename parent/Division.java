/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parent;

/**
 *
 * @author Student
 */
public class Division extends Base {
    public Division(double a, double b){
    super(a,b);    
    }
    
    @Override
    public double calculate(){
        if (getOperand2()==0){
            System.out.println("undefined");
            return 0;
        }
        return getOperand1()/getOperand2();
    }
}
