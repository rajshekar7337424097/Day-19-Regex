
package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailID2 {
	public static void main(String[] args) {
		
		String emailPattern = "\"^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\\\.[a-zA-Z0-9-]+)*$\"";
		Pattern regex = Pattern.compile(emailPattern);
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the EmailID:");
		String inputStr = sc.nextLine();
		Matcher emailMatcher = regex.matcher(inputStr);
		sc.close();
		if(emailMatcher.matches()) {
			System.out.println(inputStr+"valid EmailID");
		}else {
			System.out.println(inputStr+"invalid EmailID");
		}	
	}
}
