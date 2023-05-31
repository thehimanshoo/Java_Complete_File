/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int num, result;
	    result = sum(10);
		System.out.println("Result :- " + result);
	};
	
	public static int sum(int num){
	    if(num > 0)
	        return num + sum(num-1);
	    else
	        return 0;
	};
	
	
}
