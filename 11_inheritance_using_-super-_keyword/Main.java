/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

class A{
    int i, j, sum, avg;
     
    void display(){
        Scanner sc = new Scanner(System.in);
        System.out.print("a : ");
        i = sc.nextInt();
        
        System.out.print("b : ");
        j = sc.nextInt();
        
        sum = i+j;
        System.out.println("This is A Class :- "+ sum);
    };
};


class B extends A{
    int avg;
    
    void display(){
        super.display();
        avg = sum/2;
        
        System.out.println("This is B Class :- " + avg);
    };
};


class Main{
    public static void main(String args[]){
        B obj = new B();
        obj.display();
    };
};