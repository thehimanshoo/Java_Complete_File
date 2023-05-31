/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Demo extends Thread {
    
    public void run(){
        for(int i=0; i<5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            };
            System.out.println();
        };
        
    };
    
}

public class Main
{
	public static void main(String[] args) {
	    Demo obj = new Demo();
	    obj.start();
	}
}
