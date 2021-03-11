package com.cg.tsw.ui;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter no.of rows");
		int n = scan.nextInt();
		int count = 1;
		for (int i = n; i > 0; i--) {
			for (int j = 1; j < 2 * i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= count; j++) {
				System.out.print(j + " ");

			}

			for (int j = count - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
			count++;

		}
		scan.close();
	}

}
