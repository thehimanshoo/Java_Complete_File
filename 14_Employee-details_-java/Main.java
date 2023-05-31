import java.util.Scanner;

class Main{
    String name;
    int age;
    String company;
    String designation;
    int salary;
    String address;
    
    // Creating constructor to initialise the variable in Object
    Main(String name, int age, String company, String designation, int salary, String address){
        this.name = name;
        this.age = age;
        this.company = company;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    };
    
    // Creating method to print employeeData
    
     public void  printEmployeeDetails () {
        System.out.println("    Name: " + name);
        System.out.println("    Age: " + age);
        System.out.println("    Company: " + company);
        System.out.println("    Designation: " + designation);
        System.out.println("    Salary: " + salary);
        System.out.println("    Address: " + address);
    };
    
    public static void main(String args []){
        
        // Taking input from the user
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter employee name : ");
        String name = scn.nextLine();
        
        System.out.print("Enter employee age : ");
        int age = scn.nextInt();
        scn.nextLine(); // consume the newline character left by nextInt()
        
        System.out.print("Enter employee company : ");
        String company = scn.nextLine();
        
        System.out.print("Enter employee designation : ");
        String designation = scn.nextLine();
        
        System.out.print("Enter employee salary : ");
        int salary = scn.nextInt();
        scn.nextLine(); // consume the newline character left by nextInt()
        
        System.out.print("Enter employee address : ");
        String address = scn.nextLine();
        
        // Creating Object to store the data
        Main employeeData = new Main(name, age, company, designation, salary, address);
        System.out.println("_________________________________________________________________________________________");
        System.out.println("__________________________________Employee Details_______________________________________");
        System.out.println("_________________________________________________________________________________________");
        System.out.println();
        employeeData.printEmployeeDetails();
       
    };
};