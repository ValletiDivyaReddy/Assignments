package com.cg.tsw.ui;

import java.util.Scanner;

public class DigitsInNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter numbers:");
		int number, temp, sampleNumber = 0, numberValue;
		number = scan.nextInt();
		numberValue = number;
		while (numberValue > 0) {
			temp = numberValue % 10;
			sampleNumber = sampleNumber * 10 + temp;
			numberValue = numberValue / 10;
		}
		while (sampleNumber > 0) {
			temp = sampleNumber % 10;
			switch (temp) {
			case 1:
				System.out.print("ONE ");
				break;
			case 2:
				System.out.print("TWO ");
				break;
			case 3:
				System.out.print("THREE ");
				break;
			case 4:
				System.out.print("FOUR ");
				break;
			case 5:
				System.out.print("FIVE ");
				break;
			case 6:
				System.out.print("SIX ");
				break;
			case 7:
				System.out.print("SEVEN ");
				break;
			case 8:
				System.out.print("EIGHT ");
				break;
			case 9:
				System.out.print("NINE ");
				break;
			case 0:
				System.out.print("ZERO ");
				break;
			}
			sampleNumber = sampleNumber / 10;
		}
		scan.close();
	}
}
