package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordUC8 {
	public boolean passwordRule4(String inputStr) {
		String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$";;
		Pattern regex = Pattern.compile(passwordPattern);
		Matcher passwordMatcher = regex.matcher(inputStr);
		if(passwordMatcher.matches()) {
			System.out.println(inputStr+"Enter password is valid ");
			
		}else {
			System.out.println(inputStr+"Invalid Password");
		}
		return false;
	}
	
	public static void main(String[] args) {
		PasswordUC8 password = new PasswordUC8();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password atleast onr Special  for Login");
		String inputStr= sc.nextLine();
		sc.close();
		password.passwordRule4(inputStr);
	}

}
