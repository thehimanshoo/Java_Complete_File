/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Example extends Thread {
    int a = 15;
    int b = 20;

    // @Override
    public void run() {
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.run();
    }
}

