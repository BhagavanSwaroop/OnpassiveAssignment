package com;

import java.util.Scanner;

public class ReverseStringByWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line: ");
		String input = sc.nextLine();
		sc.close();
		String res = reverseString(input);
		System.out.println("Reversed String: " + res);
	}
	
	static String reverseString(String input){
		String[] strings = input.split("\\ ");
		String reverseString = "";
		for(String str : strings){
			StringBuilder sb = new StringBuilder(str);
			reverseString += sb.reverse() + " ";
		}
		return reverseString.trim();
	}

}
