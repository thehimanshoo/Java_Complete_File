/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    String name;
    int roll_no;
    
    // Creating constructor
    Main(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    };
    
    // Creating method to print the data
    void displayStudent(){
        System.out.println("");
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("----------------------------- Returning the value ----------------------------");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Name : " + name);
        System.out.println("Roll No. : " + roll_no);
    };
    
	public static void main(String[] args) {
	    // Taking input from users to print the data
	    Scanner scn = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String name = scn.nextLine();
        
        System.out.print("Enter Roll No. : ");
        int roll_no = scn.nextInt();
        scn.nextLine();
        
        Main Student = new Main(name, roll_no);
        
        Student.displayStudent();
	}
}
