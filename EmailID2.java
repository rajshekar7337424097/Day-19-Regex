
package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailID2 {
	public static void main(String[] args) {
		
		String emailPattern = "^abc(.+)[A-Za-z0-9]{3}+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$";
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
