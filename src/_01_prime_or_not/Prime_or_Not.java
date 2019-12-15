package _01_prime_or_not;

import javax.swing.JOptionPane;

public class Prime_or_Not {
public static void main(String[] args) {
	String _number1 = JOptionPane.showInputDialog("Enter an integer.");
	int num = Integer.parseInt(_number1);
	for(int i = 2; i<num; i++) {
		if (num % i == 0 ) {
		JOptionPane.showMessageDialog(null, "This number is composite.");
	}
		else {
			JOptionPane.showMessageDialog(null, "This number is prime.");
		}
}
}
}
