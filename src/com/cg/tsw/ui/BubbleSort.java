package com.cg.tsw.ui;

import java.util.Scanner;

public class BubbleSort {

	static int[] Sort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int numberOfElements;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of elements in array:");
		numberOfElements = scan.nextInt();
		int[] arr = new int[numberOfElements];
		System.out.println("enter the elements of array to be sorted:");
		for (int i = 0; i < numberOfElements; i++) {
			arr[i] = scan.nextInt();
		}
		arr = Sort(arr);
		for (int var : arr) {
			System.out.println(var + " ");
		}
		scan.close();
	}
}
