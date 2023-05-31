/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class BoxVolume {

    // Method to calculate the volume of a box using integer inputs for length, width, and height
    public static int calculateVolume(int length, int width, int height) {
        return length * width * height;
    }

    public static int calculateVolume(int sideLength) {
        return sideLength * sideLength * sideLength;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the box (integer):");
        int length = scanner.nextInt();

        System.out.print("Enter the width of the box (integer):");
        int width = scanner.nextInt();

        System.out.print("Enter the height of the box (integer):");
        int height = scanner.nextInt();

        System.out.print("Enter the side length of the cube (integer):");
        int sideLength = scanner.nextInt();

        int volume = calculateVolume(length, width, height);
        System.out.println("Volume of the box: " + volume);

        volume = calculateVolume(sideLength);
        System.out.println("Volume of the cube: " + volume);

        scanner.close();
    }
}
