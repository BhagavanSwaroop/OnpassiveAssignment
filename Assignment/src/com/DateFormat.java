package com;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date format:");//dd/MM/yyyy HH:mm:ss
		System.out.println("dd for day, MM for Month, yy for Year, HH for Hours, mm for Minutes, ss for seconds");
		String input = sc.nextLine();
		sc.close();
		System.out.println("Formatted Date is: "+formatDate(input));
	}
	
	static String formatDate(String input){
		SimpleDateFormat formatter = new SimpleDateFormat(input);
		return formatter.format(new Date());
	}

}
