/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.awt.*;
import javax.swing.*;

public class RectangleApplet extends JPanel {
   
   public RectangleApplet() {
      setBackground(Color.black);
   }
   
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.white);
      g.drawRect(50, 50, 100, 50);
   }
   
   public static void main(String[] args) {
      JFrame frame = new JFrame("Rectangle Applet");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(300, 200);
      RectangleApplet applet = new RectangleApplet();
      frame.add(applet);
      frame.setVisible(true);
   }
   
}


