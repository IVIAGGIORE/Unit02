package com.training.unit03.main;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a=");
		int a=sc.nextInt();
		System.out.print("b=");
		int b=sc.nextInt();
		System.out.print("c=");
		int c=sc.nextInt();
		
		if (a>0) {
			a=(int)Math.pow(a,2);
		} else {
			a=(int)Math.pow(a,4);;
		}
		if (b>0) {
			b=(int)Math.pow(b,2);;
		}else {
			b=(int)Math.pow(b,4);;
		}
		if (c>0) {
			c=(int)Math.pow(c,2);;
		}else {
			c=(int)Math.pow(c,4);;
		}
		System.out.print("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);


	}

}
