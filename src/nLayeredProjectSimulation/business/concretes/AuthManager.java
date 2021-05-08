package nLayeredProjectSimulation.business.concretes;

import nLayeredProjectSimulation.business.abstracts.AuthManagerService;
import nLayeredProjectSimulation.business.abstracts.UserService;
import nLayeredProjectSimulation.core.AuthService;
import nLayeredProjectSimulation.core.ValidationHelper;
import nLayeredProjectSimulation.entities.concretes.User;

public class AuthManager implements AuthManagerService {

	private AuthService authService;
	private UserService userService;
	
	public AuthManager(AuthService authService, UserService userService) {
		this.authService = authService;
		this.userService = userService; 
	}

	@Override
	public void register(User user) {
		var result1 = ValidationHelper.validatePassword(user.getPassword());
		var result2 = ValidationHelper.validateEmail(user.getEmail());
		var result3 = ValidationHelper.validateFirstAndLastName(user.getFirstName(), user.getLastName());
		
		if (result1 && result2 && result3) {
			this.authService.register(user);
			this.userService.add(user);
		} else {
			return;
		}
	}

	@Override
	public void login(User user) {
		this.authService.login(user);
	}

}
