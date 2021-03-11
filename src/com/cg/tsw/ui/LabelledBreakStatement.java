package com.cg.tsw.ui;

import java.util.Scanner;

public class LabelledBreakStatement {

	public static void main(String[] args) {
			int number;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the value");
			number = scan.nextInt();
			Outer: for (int i = 0; i < number; i++) {
				for (int j = 0; j <= number; j++) {
					System.out.println(i + " is i " + j + " is j");
					if (j == number / 2) {
						break Outer;
					}
				}
			}
			scan.close();


	}

}
