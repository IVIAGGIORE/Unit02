package com.training.unit03.main;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x=");
		double x=sc.nextDouble();
		if (x>3) {
			System.out.printf("f(x)=%.1f",1/(x*x+1));
		} else if (x<=-3) {
			System.out.printf("f(x)=%d",9);
		}
	}
}
