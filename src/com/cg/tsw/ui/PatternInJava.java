package com.cg.tsw.ui;

import java.util.Scanner;

public class PatternInJava {
	public static void main(String[] args) {
		int a, b, x, y;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = scan.nextInt();
		for (a = 1; a <= rows; a++) {
			if (a % 2 == 0) {
				x = 1;
				y = 0;
			} else {
				x = 0;
				y = 1;
			}
			for (b = 1; b <= a; b++) {
				if (b % 2 == 0) {
					System.out.print(x+" ");
				} else {
					System.out.print(y+" ");
				}
			}
			System.out.println("\n");
		}
		scan.close();
	}
}
