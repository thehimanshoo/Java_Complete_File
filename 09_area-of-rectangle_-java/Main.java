/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        // Taking input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        
        System.out.print("Enter the height of the rectangle: ");
        int height = scanner.nextInt();
        int area = calculateArea(width, height);
        
        System.out.println("The area of the rectangle is: " + area);
    }
    
    public static int calculateArea(int width, int height) {
        return width * height;
    }
}