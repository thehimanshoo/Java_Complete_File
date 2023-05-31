/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++){
		    
		    for(int j=1; j<=5; j++){
		        
		        if( (i==2 && j%2!=0) || (j==i-1) || (j==9-i) || (i==4 && j%2!=0) || j==5-i ){
		            
		            System.out.print("*");
		        }else{
		            
		            System.out.print(" ");
		        }
		    };
		    System.out.println();
		}
	}
}
