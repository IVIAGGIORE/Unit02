package com.training.unit03.main;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a=");
		int a=sc.nextInt();
		System.out.print("b=");
		int b=sc.nextInt();
		double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		System.out.printf("a=%d, b=%d, c=%.1f",a,b, c);
	}

}
