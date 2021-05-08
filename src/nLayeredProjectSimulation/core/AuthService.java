package nLayeredProjectSimulation.core;

import nLayeredProjectSimulation.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void login(User user);
}
