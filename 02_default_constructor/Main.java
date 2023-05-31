public class Main {
    private int number;
    private String text;
    
    // Default constructor
    public Main() {
        this.number = 0;
        this.text = "Hello world";
    };
    
    // Get method to return the statements
    public int getNumber() {
        return number;
    };
    
    public String getText() {
        return text;
    };
    
    public static void main(String arg []){
        Main obj = new Main();
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("    " + obj.getNumber());
        System.out.println("    " +obj.getText());
    };
};

