/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    
	public static void main(String[] args) {
	    int start, end, result;
	    result = sum(1, 10);
	    
		System.out.println("Result :- " + result);
	}
	
	public static int sum(int start, int end){
	    
	    if(start < end){
	        return end + sum(start, end-1);
	    }else{
	        return end;
	    }
	}
}
