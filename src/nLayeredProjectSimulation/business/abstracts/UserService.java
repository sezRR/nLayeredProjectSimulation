package nLayeredProjectSimulation.business.abstracts;

import java.util.List;

import nLayeredProjectSimulation.entities.concretes.User;

public interface UserService {
	List<User> getAll();
	User get(int userId);
	
	void add(User user);
	void update(User user);
	void delete(User user);
}
