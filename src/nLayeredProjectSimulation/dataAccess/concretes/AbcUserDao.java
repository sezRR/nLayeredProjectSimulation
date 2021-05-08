package nLayeredProjectSimulation.dataAccess.concretes;

import java.util.List;

import nLayeredProjectSimulation.dataAccess.abstracts.UserDao;
import nLayeredProjectSimulation.entities.concretes.User;

public class AbcUserDao implements UserDao {

	@Override
	public List<User> getAll() {
		return null;
	}

	@Override
	public User get(int userId) {
		return null;
	}

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " added to database with Abc");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " updated on database with Abc");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " deleted from database with Abc");
	}

}
