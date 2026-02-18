    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parent;

/**
 *
 * @author Student
 */
public class Addition extends Base {
    public Addition(double a, double b){
        super(a,b);
    }
    
    @Override
    public double calculate(){
        return getOperand1()+getOperand2();
    }
    
}
