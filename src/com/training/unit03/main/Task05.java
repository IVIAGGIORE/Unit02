package com.training.unit03.main;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a=");
		int a=sc.nextInt();
		System.out.print("b=");
		int b=sc.nextInt();
		System.out.print("c=");
		int c=sc.nextInt();
		System.out.printf("%.2f",(b+Math.sqrt(b*b+4*a*c))/(2*a)-Math.pow(a,3)*c+b);
	}

}
