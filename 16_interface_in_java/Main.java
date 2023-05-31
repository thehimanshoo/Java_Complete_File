/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface A {
    void Adisplay();
    void Ashow();
};

interface B {
    void Bdisplay();
    void Bshow();
};

class AB implements A,B {
    
    public void Adisplay(){
        System.out.println("A DISPLAY");
    };
    
    public void Ashow(){
        System.out.println("A SHOW");
    };
    
    public void Bdisplay(){
        System.out.println("B DISPLAY");
    };
    
    public void Bshow(){
        System.out.println("B SHOW");
    }
}

public class Main
{
	public static void main(String[] args) {
		AB obj = new AB();
		obj.Adisplay();
		obj.Ashow();
		obj.Bdisplay();
		obj.Bshow();
	}
}
