import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    private TextField displayField;
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private Button addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton;

    private double num1, num2, result;
    private String operator;

    public Calculator() {
        setLayout(new BorderLayout());
        setTitle("Calculator");

        // Create display field
        displayField = new TextField("");
        add(displayField, BorderLayout.NORTH);

        // Create number buttons
        Panel numPanel = new Panel(new GridLayout(4, 3));
        button0 = new Button("0");
        button1 = new Button("1");
        button2 = new Button("2");
        button3 = new Button("3");
        button4 = new Button("4");
        button5 = new Button("5");
        button6 = new Button("6");
        button7 = new Button("7");
        button8 = new Button("8");
        button9 = new Button("9");

        // Add number buttons to numPanel
        numPanel.add(button1);
        numPanel.add(button2);
        numPanel.add(button3);
        numPanel.add(button4);
        numPanel.add(button5);
        numPanel.add(button6);
        numPanel.add(button7);
        numPanel.add(button8);
        numPanel.add(button9);
        numPanel.add(button0);

        // Create operator buttons
        Panel operatorPanel = new Panel(new GridLayout(5, 1));
        addButton = new Button("+");
        subtractButton = new Button("-");
        multiplyButton = new Button("*");
        divideButton = new Button("/");
        equalsButton = new Button("=");

        // Add operator buttons to operatorPanel
        operatorPanel.add(addButton);
        operatorPanel.add(subtractButton);
        operatorPanel.add(multiplyButton);
        operatorPanel.add(divideButton);
        operatorPanel.add(equalsButton);

        // Create clear button
        clearButton = new Button("C");

        // Add components to frame
        add(numPanel, BorderLayout.CENTER);
        add(operatorPanel, BorderLayout.EAST);
        add(clearButton, BorderLayout.SOUTH);

        // Add action listeners to buttons
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        equalsButton.addActionListener(this);
        clearButton.addActionListener(this);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("C")) {
            // Clear display
            displayField.setText("");
            num1 = 0;
            num2 = 0;
            operator = "";
        } else if (command.equals("=")) {
            // Calculate result and display it
            num2 = Double.parseDouble(displayField.getText());

            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                result = num1 / num2;
            }

            displayField.setText(Double.toString(result));
        }
    }
}
