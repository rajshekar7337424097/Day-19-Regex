package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameUC2 {
	public static void main(String[] args) {
		String namePattern = "^[A-Z]{1}[a-z]{3,9}$";
		Pattern regex = Pattern.compile(namePattern);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Last Name :");
		String inputStr = sc.nextLine();
		Matcher lastNameMatcher = regex.matcher(inputStr);
		sc.close();
		if(lastNameMatcher.matches()) {
			System.out.println(inputStr+" is valid Name");
		}else {
			System.out.println(inputStr+ " is invalid Name");
		}
	}
}
