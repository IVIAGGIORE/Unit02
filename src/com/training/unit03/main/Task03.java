package com.training.unit03.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a=");
		int a=sc.nextInt();
		System.out.print("b=");
		int b=sc.nextInt();
		System.out.print("c=");
		int c=sc.nextInt();
		System.out.printf("a^2-(b-c)^2+log(b*b+1)=%.1f",a*a-Math.pow(b-c,2)+Math.log(b*b+1));
	}
}
