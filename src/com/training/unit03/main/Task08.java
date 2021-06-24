package com.training.unit03.main;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a=");
		double x=sc.nextDouble();
		System.out.print("b=");
		double b=sc.nextDouble();
		System.out.print("h=");
		double h=sc.nextDouble();
		System.out.printf("f(x) на промежутки [%.1f , %.1f] с шагом %.1f \n", x,b,h);
		System.out.printf("_________________________________\n");
		while (x<=b) {
			System.out.printf("|\t%4.2f\t|\t%4.2f\t|\n", x , 2*Math.tan(x/2)+1);
			x=x+h;
		}
		System.out.printf("_________________________________\n");

	}

}
