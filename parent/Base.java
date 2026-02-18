/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parent;

/**
 *
 * @author Student
 */
public abstract class Base {
   private double operand1;
    private double operand2;
    
    public Base(double operand1, double operand2){
        this.operand1=operand1;
        this.operand2=operand2;
    }
    
    public double getOperand1(){
        return operand1;
    }
    public double getOperand2(){
        return operand2;
    }
    
    public abstract double calculate();
} 
