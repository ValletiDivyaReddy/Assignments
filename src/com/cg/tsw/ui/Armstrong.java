package com.cg.tsw.ui;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num, number, temp, total = 0;
		System.out.println("�nter a Number");
		num = scan.nextInt();
		scan.close();
		number = num;

		for (; number != 0; number /= 10) {
			temp = number % 10;
			total = total + temp * temp * temp;
		}
		if (total == num) {
			System.out.println(num + " is an Armstrong number");
		} else {
			System.out.println(num + " is not an Armstrong number");
		}
		scan.close();
	}

}
