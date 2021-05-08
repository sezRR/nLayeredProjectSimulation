package nLayeredProjectSimulation.core;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationHelper {
	public static boolean validatePassword(String password) {
		if (!(password.length() >= 6)) {
			System.err.println("Your password must be 6 or more than 6 characters"); 
			return false;
		}
		
		return true;
	}
	
	static List<String> emails = new ArrayList<String>();

	public static boolean validateEmail(String email) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);

		var result = matcher.matches();

		if (result) {
			for (String forEachEmail : emails) {
				if (forEachEmail.equals(email)) {
					System.err.println("The email address you entered is already in use on another account");
					return false;
				}
			}
			emails.add(email);
			return true;
		} else {
			System.err.println("Please enter a valid email address");
			return false;
		}
	}

	public static boolean validateFirstAndLastName(String firstName, String lastName) {
		boolean result = true;
		
		if(!(firstName.length() >= 2)) {
			result = false;
			System.err.println("Your first name must be 2 or more than 2 characters.");
		}
		if(!(lastName.length() >= 2)) {
			result = false;
			System.err.println("Your last name must be 2 or more than 2 characters.");
		}
		
		return result;
	}
}
