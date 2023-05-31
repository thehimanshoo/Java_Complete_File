/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class P {
    String s = "Parent class Variable";
}

class C extends P{
    String s = "Child class Variable";
    
    void m1(){
        System.out.println(s);          // Child class Variable
        System.out.println(this.s);     // Child class Variable
        System.out.println(super.s);    // Parent class Variable
    }
};

public class Main{
    Main(){
        System.out.println("Test Constructor");
    };
    
    public static void main(String [] args){
        C obj = new C();
        obj.m1();
        
        Main s = new Main();
    }
}