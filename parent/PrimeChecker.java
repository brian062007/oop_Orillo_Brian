/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parent;

/**
 *
 * @author Student
 */
public class PrimeChecker extends Number{
    public PrimeChecker(int number) {
        super(number);
    }

    @Override
    public void analyze() {
        int n = getNumber();
        boolean isPrime = n > 1;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(n + " is " + (isPrime ? "Prime" : "Not Prime"));
    }

}
