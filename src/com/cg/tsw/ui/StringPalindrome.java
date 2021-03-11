package com.cg.tsw.ui;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String str = scan.next();
		int len = str.length();
		String rev = "";
		for (int j = len - 1; j >= 0; j--) {
			rev = rev + (str.charAt(j));
		}

		if (str.equalsIgnoreCase(rev)) {
			System.out.println("Given string is a Palindrome");

		} else {
			System.out.println("Given string is not a palindrome");
		}
		scan.close();
	}

}
