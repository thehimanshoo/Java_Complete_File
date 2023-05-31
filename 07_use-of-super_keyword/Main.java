/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class AverageCalculator {
    private double[] numbers;

    public AverageCalculator(double n1, double n2, double n3, double n4, double n5) {
        // Call the constructor of the superclass (Object) using the super keyword
        super();

        // Initialize the array of numbers
        numbers = new double[5];

        numbers[0] = n1;
        numbers[1] = n2;
        numbers[2] = n3;
        numbers[3] = n4;
        numbers[4] = n5;
    }

    public double getAverage() {
        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        AverageCalculator calculator = new AverageCalculator(3.4, 5.2, 1.0, 7.8, 2.5);

        // Calculate and print the average
        System.out.println("The average is: " + calculator.getAverage());
    }
}

