package com.cg.tsw.ui;

import java.util.Scanner;

public class IdentityMatrix {

	public static void main(String[] args) {
		int i, j, rows, col, Flag = 1;

		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter Identity Matrix Rows and Col :  ");
		rows = scan.nextInt();
		col = scan.nextInt();
		int[][] arr = new int[rows][col];
		System.out.println("Enter the Identity Matrix  :  ");
		for (i = 0; i < rows; i++) {
			for (j = 0; j < col; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

		for (i = 0; i < rows; i++) {
			for (j = 0; j < col; j++) {
				if (arr[i][j] != 1 && arr[j][i] != 0) {
					Flag = 0;
					break;
				}
			}
		}
		if (Flag == 1) {
			System.out.println("\nMatrix is an Identity Matrix");
		} else {
			System.out.println("\nMatrix is Not an Identity Matrix");
			scan.close();
		}
	}
}
