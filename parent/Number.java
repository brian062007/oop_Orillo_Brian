/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parent;

/**
 *
 * @author Student
 */
public abstract class Number {
     private int number;

    public Number(int number) {
        this.number = number;
    }

    // Encapsulation
    public int getNumber() {
        return number;
    }

    public abstract void analyze();

}
