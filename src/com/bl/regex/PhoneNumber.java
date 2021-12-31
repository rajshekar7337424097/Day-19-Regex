package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
	public static void main(String[] args) {
		 
		String phoneNumber = "^[0-9]{2}\\s{1}[0-9]{10}$";
		Pattern regex = Pattern.compile(phoneNumber);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PhoneNumber :");
		String inputStr = sc.nextLine();
		Matcher phoneNumMatcher = regex.matcher(inputStr);
		sc.close();
		if(phoneNumMatcher.matches()) {
			System.out.println(inputStr+"valid Phone Number");
		}else {
			System.out.println(inputStr+"Invalid Phone Number");
		}
	}

}
