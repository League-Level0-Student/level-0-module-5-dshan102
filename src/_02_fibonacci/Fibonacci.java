package _02_fibonacci;
//first 12 digits of sequence: 0,1,1,2,3,5,8,13,21,34,55,89
public class Fibonacci {
public static void main(String[] args) {
	int digit1 = 0;
	int digit2 = 1;
	System.out.println(digit1);
	System.out.println(digit2);
	for(int i=0; i<10; i++) {
	int digit3 = digit1+digit2;
	System.out.println(digit3);
	digit1=digit2;
	digit2=digit3;
	}
}
}
