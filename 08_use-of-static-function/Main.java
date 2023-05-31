/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class MathUtils {
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public boolean isEven(int a) {
        return a % 2 == 0;
    }
    
    public static void main(String[] args) {

        int sum = MathUtils.add(5, 10);
        System.out.println("The sum is: " + sum);
        
        int product = MathUtils.multiply(5, 10);
        System.out.println("The product is: " + product);
        
        MathUtils obj = new MathUtils();
        boolean isFiveEven = obj.isEven(5);
        System.out.println("Is 5 even? " + isFiveEven);
    }
}
