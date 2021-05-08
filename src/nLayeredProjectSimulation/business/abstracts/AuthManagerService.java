package nLayeredProjectSimulation.business.abstracts;

import nLayeredProjectSimulation.entities.concretes.User;

public interface AuthManagerService {
	void register(User user);
	void login(User user);
}
