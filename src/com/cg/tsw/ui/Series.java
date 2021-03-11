package com.cg.tsw.ui;

import java.util.Scanner;

public class Series {
	static double factorialFunction(int i) {
		int fact = 1;
		for (int j = 1; j <= i; j++) {
			fact = fact * j;
		}
		return fact;
	}

	static double exponentialFunction(int i, int x) {
		int exponential = 1;
		for (int j = 1; j <= i; j++) {
			exponential = exponential * x;
		}
		return exponential;
	}

	public static void main(String[] args) {
		int x, n;
		double series = 0, exponential, factorial;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		x = scan.nextInt();
		System.out.println("Enter the value of n:");
		n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			factorial = factorialFunction(i);
			exponential = exponentialFunction(i, x);
			series = series + (exponential / factorial);
		}
		System.out.println(series);
		scan.close();

	}

}
