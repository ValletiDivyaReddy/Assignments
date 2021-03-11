package com.cg.tsw.ui;

import java.util.Scanner;

public class BinarySearch {

	static int[] Sort(int array[]) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int numOfElements;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of elements in array: ");
		numOfElements = scan.nextInt();
		int[] arr = new int[numOfElements];
		System.out.println("enter the elements of array to be sorted: ");
		for (int i = 0; i < numOfElements; i++) {
			arr[i] = scan.nextInt();
		}
		arr = Sort(arr);
		for (int var : arr) {
			System.out.println(var + " ");
		}
		scan.close();
	}
}
