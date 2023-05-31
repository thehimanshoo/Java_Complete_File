/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scn = new Scanner(System.in);
	    System.out.print("Enter the value of Num :- ");
	    int num = scn.nextInt();
	    
	    for(int i=1; i<=num; i++){
	        
	        for(int s=1; s<=(num-i); s++){
	            System.out.print(" ");
	        }
	        
	        for(int j=1; j<=i; j++){
	            System.out.print(j);
	        };
	       	System.out.println();
	    }
	}
}
