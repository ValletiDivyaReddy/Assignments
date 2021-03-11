package com.cg.tsw.ui;

import java.util.*;

public class MatrixEqual {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no.of rows in matrix 1");
		int r1 = scan.nextInt();
		System.out.println("enter no.of columns in matrix 1");
		int c1 = scan.nextInt();
		System.out.println("enter no.of rows in matrix 2");
		int r2 = scan.nextInt();
		System.out.println("enter no.of columns in matrix 2");
		int c2 = scan.nextInt();

		boolean flag = true;
		if ((r1 != r2) || (c1 != c2)) {
			System.out.println("matrices are not equal");

		} else {
			int arr1[][] = new int[r1][c1];
			System.out.println("enter elements in matrix 1");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					arr1[i][j] = scan.nextInt();
				}
			}

			int arr2[][] = new int[r2][c2];
			System.out.println("enter elements in matrix 2");
			for (int i = 0; i < r2; i++) {
				for (int j = 0; j < c2; j++) {
					arr2[i][j] = scan.nextInt();
				}
			}

			for (int l = 0; l < r1; l++) {
				for (int m = 0; m < c1; m++) {
					if (arr1[l][m] != arr2[l][m]) {
						flag = false;
						break;

					}

				}
			}

			if (flag) {
				System.out.println("Matrices are equal");
			} else {
				System.out.println("Matrices are not equal");
			}
		}
		scan.close();

	}

}
