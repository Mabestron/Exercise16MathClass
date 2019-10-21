package com.Exercise16MathClass.app;

import java.lang.Math;

public class MathematicalOperation {

	public static void main(String[] args) {
		double number=3.76;
		double number2=4.5;
		
		System.out.println("e value: "+Math.E);
		System.out.println("Pi value: "+Math.PI);
		System.out.println("Absolute value of -2.15 is: "+Math.abs(-2.15));
		System.out.println("The Cube root of 27 is:"+Math.cbrt(27));
		System.out.println("The math round of 3.76 is:"+Math.round(number));
		System.out.println("The math round ceil of 3.76 is:"+Math.ceil(number));// redondeo hacia arriba
		System.out.println("The math round floor of 3.76 is:"+Math.floor(number)); //redondeo hacia abajo
		System.out.println("Incrent of 5 is: "+Math.incrementExact(5));
		System.out.println("Decrent of 5 is: "+Math.decrementExact(5));
		System.out.println("Power value of 3 euler is: "+Math.exp(3));
		System.out.println(String.format("Which is bigger? %.2f or %.2f: %.2f",number,number2, Math.max(number, number2)));
		System.out.println(String.format("Which is Smaller? %.2f or %.2f: %.2f",number,number2, Math.min(number, number2)));
		System.out.println("Sin of 0 degrees is: "+Math.sin(0));
		System.out.println("Sin of PI/2 degrees is: "+Math.sin(Math.PI/2));
		System.out.println("Cos of 0 degrees is: "+Math.cos(0));
		System.out.println("Cos of 0 degrees is: "+Math.cos(Math.PI/2));
		

	}

}
