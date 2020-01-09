package _05_greeter;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null,"Hello "+input);
	String input1 = JOptionPane.showInputDialog("How are you?");
	JOptionPane.showMessageDialog(null,"well that's "+input1);
}
}
