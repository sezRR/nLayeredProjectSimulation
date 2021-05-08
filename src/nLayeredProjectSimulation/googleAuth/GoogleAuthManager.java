package nLayeredProjectSimulation.googleAuth;

import java.util.Dictionary;
import java.util.Hashtable;

import nLayeredProjectSimulation.entities.concretes.User;

public class GoogleAuthManager {
	
	Dictionary<String, String> mailsAndPasswords = new Hashtable<String, String>();
	
	public void register(User user) {
		System.out.println("Registered with Google Auth Manager (" + user.getEmail() + ")");
		mailsAndPasswords.put(user.getEmail(), user.getPassword());
	}
	
	public void login(User user) {
		var mailAndPassword = mailsAndPasswords.get(user.getEmail());
		if (mailAndPassword != null) {
			if (user.getPassword().equals(mailAndPassword)) {
				System.out.println("Logged in to the system with Google Auth Manager (" + user.getEmail() + ")");
			} else {
				System.err.println("\nWrong password");
				return;
			}
		} else {
			System.err.println("\nWrong E-Mail or Password");
			return;
		}
	}
}
