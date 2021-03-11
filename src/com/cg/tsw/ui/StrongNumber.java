package com.cg.tsw.ui;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = scan.nextInt();
		int fact, sum = 0;
		int n = number;

		while (n != 0) {
			fact = 1;
			int r = n % 10;
			for (int i = r; i >= 1; i--)
				fact = fact * i;
			sum = sum + fact;
			n = n / 10;
		}

		if (sum == number) {
			System.out.println("Strong Number");
		} else {
			System.out.println("Not a Strong Number");
		}
		scan.close();

	}

}
