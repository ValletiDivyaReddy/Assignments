package com.cg.tsw.ui;

import java.util.Scanner;

public class AdditionOfTwoMatrix {
	static void AdditionOfMatrix(int[][] matrix1, int[][] matrix2, int sizeOfMatrix1, int sizeOfMatrix2) {
		for (int i = 0; i < sizeOfMatrix1; i++) {
			for (int j = 0; j < sizeOfMatrix2; j++) {
				matrix1[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
	}

	public static void main(String[] args) {
		int lengthOfMatrix1, lengthOfMatrix2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of matrices in space seperated integers:");
		lengthOfMatrix1 = scan.nextInt();
		lengthOfMatrix2 = scan.nextInt();
		System.out.println("Enter the " + lengthOfMatrix1 + "x" + lengthOfMatrix2 + " matrix1");
		int[][] matrix1 = new int[lengthOfMatrix1][lengthOfMatrix2];
		int[][] matrix2 = new int[lengthOfMatrix1][lengthOfMatrix2];
		for (int i = 0; i < lengthOfMatrix1; i++) {
			for (int j = 0; j < lengthOfMatrix2; j++) {
				matrix1[i][j] = scan.nextInt();
			}
		}
		System.out.println("Enter the " + lengthOfMatrix1 + "x" + lengthOfMatrix2 + " matrix2:");
		for (int i = 0; i < lengthOfMatrix1; i++) {
			for (int j = 0; j < lengthOfMatrix2; j++) {
				matrix2[i][j] = scan.nextInt();
			}
		}
		AdditionOfMatrix(matrix1, matrix2, lengthOfMatrix1, lengthOfMatrix2);

		for (int[] i : matrix1) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		scan.close();

	}
}
