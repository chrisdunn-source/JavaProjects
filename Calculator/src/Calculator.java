import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
    JFrame frame;
    JTextField field;
    JButton[] numberButtons = new JButton[10];
    JButton[] fuctionButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Calculator()
    {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.set
    }

    public static void main(String [] args)
    {
        Calculator calc = new Calculator()
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
