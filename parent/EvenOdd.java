/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parent;

/**
 *
 * @author Student
 */
public class EvenOdd extends Number {
    public EvenOdd(int number) {
        super(number);
    }

    @Override
    public void analyze() {
        System.out.println(getNumber() + " is " +
                (getNumber() % 2 == 0 ? "Even" : "Odd"));
    }
}

