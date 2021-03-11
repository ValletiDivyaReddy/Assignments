package com.cg.tsw.ui;

import java.util.Scanner;

public class Recursion {
	static int max(int[] arr, int a) {
		if (a == 1) {
			return arr[0];
		}
		return Math.max(arr[a - 1], max(arr, a - 1));

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no.of elements");
		int m = scan.nextInt();
		System.out.print("enter elements");
		int arr[] = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = scan.nextInt();

		}
		System.out.println(max(arr, m));
		scan.close();

	}

}
