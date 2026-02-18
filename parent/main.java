/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parent;

/**
 *
 * @author Student
 */
public class main {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Problem 1
        System.out.println("Arithmetic Operations:");
        Base add=new Addition(67,76);
       
        Base div=new Division(20,4);
        
        System.out.println("Addition: " + add.calculate());
        
        System.out.println("Division: " + div.calculate());
        
        //Problem 2
        System.out.println("Geometry Computations:");
        Shape circle = new Circle(6);
        Shape rectangle = new Rectangle(13, 9);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Circumference: " + circle.perimeter());

        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        //Problem 3
        System.out.println("Number Analysis:");
        Number primeChecker = new PrimeChecker(67);
        Number factorial = new Factorial(6);
        Number evenOdd = new EvenOdd(7);

        primeChecker.analyze();
        factorial.analyze();
        evenOdd.analyze();
        
        //Problem 4
        //Why Inheritance work?
        //-Shared data and behavior live in parent classes
        //-Child classes specialize behavior
        //-Polymorphism allows uniform method calls
        
        //Prolem 5
        //Extensibility
        //-New operations (e.g., Sine, Cosine, Mean, Median) can be added by creating new child classes
        //-Existing code does not need to be modified
        //-Encapsulation protects internal values from misuse
        //-Abstract base classes enforce consistent behavior
    }
    
}
