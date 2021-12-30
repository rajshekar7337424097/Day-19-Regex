package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIDUC3 {
	public static void main(String[] args) {
		
		String emailPattern = "^abc(.+)[A-Za-z0-9]{3}+(@+b)bl+(.+)[co]*(.[A-Za-z]{2})$";
		Pattern regex = Pattern.compile(emailPattern);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmailID");
		String inputStr= sc.nextLine();
		Matcher emailIDMatcher = regex.matcher(inputStr);
		sc.close();
		if(emailIDMatcher.matches()) {
			System.out.println(inputStr+" is valid");
		}else {
			System.out.println(inputStr+" is invalid input");
		}	
	}
}
