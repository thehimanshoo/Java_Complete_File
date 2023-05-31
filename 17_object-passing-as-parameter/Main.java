/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Demo{
    int a, b;
    
    Demo(int num1, int num2){
        a = num1;
        b = num2;
    };
    
    boolean equalTo(Demo d){
        return(d.a == a && d.b == b);
    };
}

public class Main
{
	public static void main(String[] args) {
	    Demo ob1 = new Demo(100, 105);
	    Demo ob2 = new Demo(100, 105);
	    Demo ob3 = new Demo(5, 5);
	    
	    System.out.println("ob1 == ob2 " + ob1.equalTo(ob2));
	    System.out.println("ob1 == ob3 " + ob1.equalTo(ob3));

	};
};
