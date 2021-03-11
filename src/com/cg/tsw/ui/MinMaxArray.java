package com.cg.tsw.ui;

import java.util.*;

public class MinMaxArray {
	static String sumAvgMinMax(int[] arr) {
		int len = arr.length;
		int sum = 0, avg = 0, min = arr[0], max = arr[0];
		for (int i = 0; i < len; i++) {
			sum += arr[i];
			if (min > arr[i]) {
				min = arr[i];
			} else if (max < arr[i]) {
				max = arr[i];
			}
		}
		avg = sum / len;
		return "Sum is: " + sum + ", " + "Average is :" + avg + "," + "minimum elemnt is :" + min + ", "
				+ "maximum element is :" + max;
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
		System.out.println(sumAvgMinMax(arr));
		scan.close();

	}

}