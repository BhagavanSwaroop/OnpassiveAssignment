package com;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter an Integer in between 0 to 15: ");
		int i = sc.nextInt();
		if(i>15 || i<0){
			System.err.println("Value is not in the specified limits!");
		}
		else{
			int res = factorialNumber(i);
			System.out.println("Factorial of " + i + " is: " + res);
		}
		sc.close();
	}
	
	static int factorialNumber(int num){
		if(num == 0){
			return 1;
		}
		return num * factorialNumber(num-1);
	}
	

}
