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
	    System.out.print("Enter value of \"Num\" :- ");
	    int num = scn.nextInt();
	    
	    
	   // Right angle Triangle pattern
	   
	  /* for(int i=1; i<=num; i++){
	        
	        for(int j=1; j<=i; j++){
	            System.out.print(" *");
	        }
	        System.out.println(); 
	    };
	    System.out.print("Out from the Loop"); */
	    
	    
	    
	    
	    // Inverted Right angle Triangle pattern
	        
	       /* for(int i=num; i>=1; i--){
	            
	            for(int j=1; j<=i; j++){
	                System.out.print(" *");
	            };
	            System.out.println();
	        };
	        System.out.println("Out from the Loop"); */
	        
	        
	        
	   // Slant ( \\ ) pattern
	   
	  /* for(int i=1; i<=num; i++){
	       
	     for(int j=1; j<i; j++){
	         System.out.print(" ");
	     };
	     
	     for(int k=1; k<=num; k++){
	         System.out.print(" *");
	     };
	     
	     System.out.println();
	   };
	   System.out.println("Out from the Loop"); */
	   
	   // Triangle pattern
	   
	  /* for(int i=1; i<=num; i++){
	       
	       for(int j=i; j<num; j++){
	           System.out.print(" ");
	       };
	       
	       for(int k=1; k<=i; k++){
	           System.out.print(" *");
	       };
	       System.out.println();
	   };
	   System.out.println("Out from the Loop"); */
	   
	   // Opposite Right angle Triangle
	   
	  /* for(int i=1; i<=num; i++){
	       
	       for(int j=i; j<num; j++){
	           System.out.print(" ");
	       };
	       
	       for(int k=1; k<=i; k++){
	           System.out.print("*");
	       };
	       System.out.println();
	   } */
	   
	   
	   for(int i=1; i<=num; i++){
	       
	       for(int j=i; j<num; j++){
	           System.out.print(" ");
	       };
	       
	       for(int k=1; k<=i; k++){
	           System.out.print(" *");
	       };
	       System.out.println();
	   }
	    
	};
}
