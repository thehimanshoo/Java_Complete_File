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
	    
	    // Taking input from users
	    Scanner scn = new Scanner(System.in);
	    System.out.print("Enter a number : ");
	    int number = scn.nextInt();
	    
	    int sum = 0;
	    int temp = number;
	   // int temp = number;
	    
	    while(temp > 0){
	        int rem = temp % 10;
	        sum += Math.pow(rem, 3);
	        temp /= 10;
	    };
	    
	    if(sum == number){
	        
	        System.out.print(number + " is an Armstrong number.");
	        
	    }else{
	        
	        System.out.print(number + " is not an Armstrong number.");
	        
	    };
	}
}
