package com.training.unit03.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		while (sc.hasNextInt()) {
			a=a+sc.nextInt();
		}
		System.out.printf("Summa=%d",a);
	}
}
