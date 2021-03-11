package com.cg.tsw.ui;

import java.util.*;

public class SumOfDiagonalUpperLower {
	static String sodul(int[][] arr, int m, int n) {
		int sumOfDiagonal = 0, sumUpper = 0, sumLower = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					sumOfDiagonal += arr[i][i];
				} else if (i > j) {
					sumLower += arr[i][j];
				} else {
					sumUpper += arr[i][j];
				}
			}
		}
		return "sum of diagonal elements : " + sumOfDiagonal + ", " + "sum of lower triangle : " + sumLower + ", "
				+ "sum of Upper triangle : " + sumUpper;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no.of rows");
		int m = scan.nextInt();
		System.out.println("enter no.of columns");
		int n = scan.nextInt();
		System.out.print("enter elements");
		int arr[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println(sodul(arr, m, n));
		scan.close();

	}

}
