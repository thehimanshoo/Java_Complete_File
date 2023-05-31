
import java.util.Scanner;
public class Main
{
    // Creating method to check whether the given number is Armstrong or not 
    public static boolean isArmstrong(int num){
        int sum = 0;
        int temp = num;
        
        while(temp !=write a running java program to check if the given number is armstrong using method from scratch 0){
          int rem = temp % 10;
          sum += Math.pow(rem, 3);
          temp /= 10;
        };
        
        return (num == sum);
    };
    
	public static void main(String[] args) {
	    
	    // Taking input from users
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = input.nextInt();
		
		// Checking the condition whether the given number is Armstrong number or not
		if(isArmstrong(num)){
		  System.out.println(num + " is an Armstrong number.");  
		}else{
		  System.out.println(num + " is not an Armstrong number.");  
		};
	};
	
	
}
