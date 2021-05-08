package nLayeredProjectSimulation.core;

import nLayeredProjectSimulation.entities.concretes.User;
import nLayeredProjectSimulation.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {

	private GoogleAuthManager authManager;
	
	public GoogleAuthManagerAdapter() {
		this.authManager = new GoogleAuthManager();
	}
	
	@Override
	public void register(User user) {
		this.authManager.register(user);
	}

	@Override
	public void login(User user) {
		this.authManager.login(user);
	}

}
