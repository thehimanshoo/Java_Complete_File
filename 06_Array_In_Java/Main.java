/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    String[] cars = {"Fortuner", "Land Rover", "Jaguar", "Bugadi Baron", "Rolls Royace", "Audi", "Mercediz Benz", "BMW"};
    String[] bikes = {"KTM", "Duke", "Yamaha R15", "Royal Enfield", "Harley Devidson", "Tom Hohawak", "Ninja_350"};
    int[][] myArr = {{1,2,3}, {4,5,6}, {7,8,9}, {5,8,6}};
    
	public static void main(String[] args) {
	    Main obj = new Main();
	    
	    int[][] num = obj.myArr;
	    
	    for(String i: obj.cars){
	        System.out.println("Value which has been stored is :- " + i);
	    };
	   
	   	System.out.println("");
	    System.out.println("");

	    
	    for(int i=0; i<obj.bikes.length; i++){
	        System.out.println("Bike stored at Index " + i + "is :- " + obj.bikes[i]);
	    };
	    
	    System.out.println("");
	    System.out.println("Matrix Printing");
	    System.out.println("");

	    
	    for(int i=0; i<num.length; i++){
	        for(int j=0; j<num[i].length; ++j){
	            System.out.print( "   " + num[i][j] + "  ");
	        };
	        System.out.println();
	    }
		
	}
}
