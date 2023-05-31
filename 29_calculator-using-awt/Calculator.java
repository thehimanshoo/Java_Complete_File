/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    TextField display;
    Button add, sub, mul, div, equal, clear;
    double num1, num2, result;
    String operator;
    
    public Calculator() {
        // Set up the GUI
        setTitle("Calculator");
        setLayout(new FlowLayout());
        display = new TextField(20);
        add(display);
        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");
        equal = new Button("=");
        clear = new Button("Clear");
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(equal);
        add(clear);
        
        // Add action listeners to the buttons
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        equal.addActionListener(this);
        clear.addActionListener(this);
        
        // Set up the window
        pack();
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        // Get the button that was clicked
        Button button = (Button)e.getSource();
        
        // Handle the button click
        if (button == add || button == sub || button == mul || button == div) {
            // Store the first number and operator
            num1 = Double.parseDouble(display.getText());
            operator = button.getLabel();
            display.setText("");
        } else if (button == equal) {
            // Store the second number and perform the calculation
            num2 = Double.parseDouble(display.getText());
            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                result = num1 / num2;
            }
            display.setText("" + result);
        } else if (button == clear) {
            // Clear the display
            display.setText("");
        }
    }
    
    public static void main(String[] args) {
        new Calculator();
    }
}
