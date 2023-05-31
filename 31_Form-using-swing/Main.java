/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import javax.swing.*;
import java.awt.*;

public class FeedbackForm extends JFrame {

    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel emailLabel;
    private JTextField emailField;
    private JLabel feedbackLabel;
    private JTextArea feedbackArea;
    private JButton submitButton;

    public FeedbackForm() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Feedback Form");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        nameLabel = new JLabel("Name:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(nameLabel, constraints);

        nameField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(nameField, constraints);

        emailLabel = new JLabel("Email:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(emailLabel, constraints);

        emailField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(emailField, constraints);

        feedbackLabel = new JLabel("Feedback:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(feedbackLabel, constraints);

        feedbackArea = new JTextArea(10, 20);
        JScrollPane scrollPane = new JScrollPane(feedbackArea);
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(scrollPane, constraints);

        submitButton = new JButton("Submit");
        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(submitButton, constraints);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FeedbackForm();
    }
}
