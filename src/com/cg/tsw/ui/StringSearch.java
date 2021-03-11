package com.cg.tsw.ui;

import java.util.Scanner;

public class StringSearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no.of strings available");
		int n = scan.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.next();
		}
		System.out.println("enter the string to be searched");
		String a = new String();
		boolean flag = false;
		a = scan.next();
		for (int i = 0; i < n; i++) {
			if (a.equals(arr[i])) {
				flag = true;

			}

		}
		if (flag) {
			System.out.println("string is available");
		} else {
			System.out.println("string is not available");
		}
		scan.close();

	}

}
