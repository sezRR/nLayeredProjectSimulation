package nLayeredProjectSimulation.core;

import java.util.Scanner;

public class EmailConfirmationManager implements ConfirmationService {

	@Override
	public void send(String destination, String message) {
		
		boolean isInvalid = true;
		while(isInvalid) {
			System.out.println("\n-----------------E-MAIL-----------------");
			System.out.println("Sender: myemailconfirmation@manager.com");
			System.out.println("Receiver: " + destination);
			System.out.println("------------------------------------------");
			System.out.println("Title: CONFIRM YOUR ACCOUNT");
			System.out.println("Message: " + message);
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the requested confirmation message 'CONFIRM'");
			String confirmMessage = input.next();
			
			if(confirmMessage.equals("CONFIRM")) {
				isInvalid = false;
			} else {
				System.err.println("\nPlease write truly!");
			}
		}

		System.out.println("\nYou successfully confirmed your account");
	}

}
