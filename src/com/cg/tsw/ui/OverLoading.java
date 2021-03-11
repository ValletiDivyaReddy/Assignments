package com.cg.tsw.ui;

import java.util.Scanner;

public class OverLoading {
	static void array_copy(int[] dest, int[] src) {
		for (int i = 0; i < src.length; i++) {
			dest[i] = src[i];
		}
	}

	static void array_copy(int[] dest, int[] src, int num) {
		for (int i = 0; i < num; i++) {
			dest[i] = src[i];
		}
	}

	public static void main(String[] args) {
		int numberOfElements, numCopied;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		numberOfElements = scan.nextInt();
		System.out.println("Enter the elements of array");
		int[] src = new int[numberOfElements];
		int[] dest1 = new int[numberOfElements];
		for (int i = 0; i < numberOfElements; i++) {
			src[i] = scan.nextInt();
		}
		System.out.println("Enter the number of elements to be copied");
		numCopied = scan.nextInt();
		int[] dest2 = new int[numCopied];
		array_copy(dest1, src);
		array_copy(dest2, src, numCopied);
		System.out.println("Output form first function");
		for (int i = 0; i < numberOfElements; i++) {
			System.out.print(dest1[i] + " ");
		}
		System.out.println("\nOutput form second function");

		for (int i = 0; i < numCopied; i++) {
			System.out.print(dest2[i] + " ");
		}
		scan.close();
	}

}