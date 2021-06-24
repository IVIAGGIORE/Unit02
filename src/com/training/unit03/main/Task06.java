package com.training.unit03.main;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a=");
		int a=sc.nextInt();
		System.out.print("b=");
		int b=sc.nextInt();
		System.out.print("c=");
		int c=sc.nextInt();
		System.out.print("d=");
		int d=sc.nextInt();
		System.out.println(a*b/(c*d)-(a*b-c)/(c*d));
	}

}
