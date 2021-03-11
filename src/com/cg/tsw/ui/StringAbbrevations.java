package com.cg.tsw.ui;

import java.util.Scanner;

public class StringAbbrevations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String str = scan.nextLine();
		String[] parts = str.split(" ");
		for (int j = 0; j < parts.length; j++) {
			System.out.print(parts[j].charAt(0) + ".");
		}
		scan.close();

	}

}
