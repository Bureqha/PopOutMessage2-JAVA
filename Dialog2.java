
package gui;
import javax.swing.JOptionPane;

public class Dialog2 {
    public static void main(String args[])
    {
        String name=JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Your name is " +name);
    }
}
