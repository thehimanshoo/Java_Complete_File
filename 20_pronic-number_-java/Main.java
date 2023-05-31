/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    int num;
    
    void Pronic_Number(int num){
        this.num = num;

    };
    
	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
		System.out.print("Enter a Pronic Number : ");
		int num = scn.nextInt();
		
		int square = (int) Math.sqrt(num);
		
		if(square * (square + 1) == num){
		    System.out.println(num + " is a Pronic Number.");
		}else{
		    System.out.println(num + " is not a Pronic Number.");
		};
		
	};
};
