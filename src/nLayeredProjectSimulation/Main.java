package nLayeredProjectSimulation;

import java.util.Scanner;

import nLayeredProjectSimulation.business.concretes.AuthManager;
import nLayeredProjectSimulation.business.concretes.UserManager;
import nLayeredProjectSimulation.core.EmailConfirmationManager;
import nLayeredProjectSimulation.core.GoogleAuthManagerAdapter;
import nLayeredProjectSimulation.dataAccess.concretes.AbcUserDao;
import nLayeredProjectSimulation.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		AuthManager authManager = new AuthManager(new GoogleAuthManagerAdapter(), new UserManager(new AbcUserDao(), new EmailConfirmationManager()));

		while (true) {
			System.out.println("\nEnter an option for continue");
			System.out.println("1) Login");
			System.out.println("2) Register");
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("\nOption");
			String inputOption = scanner.next();
			
			switch (inputOption) {
			case "1": {
				System.out.println("\nPlease write your E-Mail and Password");
				User user = new User();
				
				Scanner userScanner = new Scanner(System.in);
				String email = userScanner.next();
				String password = userScanner.next();
				
				user.setEmail(email);
				user.setPassword(password);
				
				authManager.login(user);
				break;
			}
			
			case "2":{
				System.out.println("\nPlease write your First Name, Last Name, E-Mail and Password");
				User user = new User();
				
				Scanner userScanner2 = new Scanner(System.in);
				String firstName = userScanner2.next();
				String lastName = userScanner2.next();
				String email = userScanner2.next();
				String password = userScanner2.next();
				
				user.setFirstName(firstName);
				user.setLastName(lastName);
				user.setEmail(email);
				user.setPassword(password);
				
				authManager.register(user);
				break;
			}
			
			default:

			}
		}

	}

}
