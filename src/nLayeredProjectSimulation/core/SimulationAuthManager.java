package nLayeredProjectSimulation.core;

import java.util.Dictionary;
import java.util.Hashtable;

import nLayeredProjectSimulation.entities.concretes.User;

public class SimulationAuthManager implements AuthService {

	Dictionary<String, String> mailsAndPasswords = new Hashtable<String, String>();
	
	@Override
	public void register(User user) {
		System.out.println("Registered with Simulation Auth Manager (" + user.getEmail() + ")");
		mailsAndPasswords.put(user.getEmail(), user.getPassword());
	}

	@Override
	public void login(User user) {
		var mailAndPassword = mailsAndPasswords.get(user.getEmail());
		if (mailAndPassword != null) {
			if (user.getPassword().equals(mailAndPassword)) {
				System.out.println("Logged in to the system with Simulation Auth Manager (" + user.getEmail() + ")");
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
