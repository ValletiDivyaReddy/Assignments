package com.cg.tsw.ui;

import java.util.Scanner;

public class JavaStarPattern {

	public static void main(String args[]) {
		int Number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no of rows:");
		Number = scan.nextInt();
		for (int i = Number; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		scan.close();
	}
}