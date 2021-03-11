package com.cg.tsw.ui;

import java.util.Scanner;

public class VowelConsonantCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vowelCount = 0, consonantCount = 0;
		System.out.println("enter the string");
		String str = scan.nextLine();
		String temp = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if ((temp.charAt(i) == 'a') || (temp.charAt(i) == 'e') || (temp.charAt(i) == 'i') || (temp.charAt(i) == 'o')
					|| (temp.charAt(i) == 'u')) {
				vowelCount += 1;
			} else {
				consonantCount += 1;
			}
		}
		System.out.println("no.of vowels : " + vowelCount + "   no.of consonants : " + consonantCount);
		scan.close();
	}

}
