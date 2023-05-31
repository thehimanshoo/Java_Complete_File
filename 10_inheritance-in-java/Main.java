// Base Class Subjects
class Subjects {

  String sub1; 
  String sub2; 
  String sub3;       
  String sub4; 
  String sub5; 

  // Parameterized Constructor
  public Subjects(String sub1, String sub2, String sub3, String sub4, String sub5) {
    this.sub1 = sub1;
    this.sub2 = sub2;
    this.sub3 = sub3;  
    this.sub4 = sub4;
    this.sub5 = sub5;
  };
  
};

// Derived Class Marks
class Marks extends Subjects {

  // Private field
  int marks1;
  int marks2;
  int marks3;
  int marks4;
  int marks5;

  // Parameterized Constructor
  public Marks(String sub1, String sub2, String sub3, String sub4, String sub5, int marks1, int marks2, int marks3, int marks4, int marks5) {
      
     //calling parent class constructor
    super(sub1, sub2, sub3, sub4, sub5); 
    
    // Initializing own class Variable
    this.marks1 = marks1;   
    this.marks2 = marks2;
    this.marks3 = marks3;
    this.marks4 = marks4;
    this.marks5 = marks5;
  };

    // Marks details
    public void marksDetails() {  
        
    // public method to print details
    System.out.println("Subject_1: " + sub1 + " => " + marks1);
    System.out.println("Subject_2: " + sub2 + " => " + marks2);
    System.out.println("Subject_3: " + sub3 + " => " + marks3);
    System.out.println("Subject_4: " + sub4 + " => " + marks4);
    System.out.println("Subject_5: " + sub5 + " => " + marks5);
    
  };
  
};

class Main {

  public static void main(String[] args) {
    //creation of subject Object
    Marks obj = new Marks("Maths", "Science", "English", "Hindi", "Computer", 85, 79, 75, 95, 45); 
    
    int sum = obj.marks1 + obj.marks2 + obj.marks3 + obj.marks4 + obj.marks5;
    float average = sum/5.0f;
    
    //calling method to print details
    obj.marksDetails(); 
    
    
    System.out.println();
    
    System.out.println("__________________________________________ Average Marks __________________________________________");
    
    System.out.println();
    System.out.println("Total Marks :- " + sum);
    System.out.println("Average Marks :- " + average+"/100");
    
  };
  
};