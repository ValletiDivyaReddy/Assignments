package com.cg.tsw.ui;

import java.util.Scanner;

public class UpperLowerDigitCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the string");
		String str = scan.nextLine();
		int digits = 0, upper = 0, lower = 0, spaces = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upper += 1;
			} else if (ch >= 'a' && ch <= 'z') {
				lower += 1;
			} else if (ch >= '0' && ch <= '9') {
				digits += 1;
			} else {
				spaces += 1;
			}

		}
		System.out.println("no.of uppercase letters : " + upper + "\nno.of lowercase letters : " + lower
				+ "\nno.of digits: " + digits + "\nno.of spaces : " + spaces);

		scan.close();

	}

}
