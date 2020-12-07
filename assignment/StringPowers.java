package assignment;

import java.util.Scanner;

public class StringPowers {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");
		String num1 = sc.next();

		System.out.println("Enter second number");
		String num2 = sc.next();

		for (int i = num2.length() - 1, j = num1.length() - 1; i >= 0; i--, j--) {
			if (j < num1.length()) {
				int pow = Character.getNumericValue(num1.charAt(j));
				int base = Character.getNumericValue(num2.charAt(i));
				System.out.println("Result : " + Math.pow(base, pow));

			}
		}

	}

}
