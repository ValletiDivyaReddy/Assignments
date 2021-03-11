package com.cg.tsw.ui;

import java.util.Scanner;

public class GradesCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter subject 1 marks:");
		double subj1 = scan.nextDouble();
		System.out.println("enter subject 2marks:");
		double subj2 = scan.nextDouble();
		System.out.println("enter subject 3 marks:");
		double subj3 = scan.nextDouble();
		final int pass = 35;
		double avg = ((subj1 + subj2 + subj3) / 3);

		if (subj1 < pass || subj2 < pass || subj3 < pass) {
			System.out.println("F");
			// exit(0);
		} else if (avg >= 70) {
			System.out.println("grade is : E");
		} else if (avg >= 60 && avg < 70) {
			System.out.println("grade is : A");
		} else if (avg >= 50 && avg < 60) {
			System.out.println("grade is : B");
		} else if (avg >= 35 && avg < 50) {
			System.out.println("grade is : C");
		}

		scan.close();

	}

}
