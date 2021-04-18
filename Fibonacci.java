package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	
	public void run() {
		int term = 10000, num1 = 0, num2 = 1;
			System.out.print("term " + term + ": ");
		
		while (num1 <= term) {
			System.out.print(num1 + " ");
			int sumTotal = num1 + num2;
			num1 = num2;
			num2 = sumTotal;
		}
	}
}
