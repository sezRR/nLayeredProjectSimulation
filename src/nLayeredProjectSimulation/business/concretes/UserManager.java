package nLayeredProjectSimulation.business.concretes;

import java.util.List;

import nLayeredProjectSimulation.business.abstracts.UserService;
import nLayeredProjectSimulation.core.ConfirmationService;
import nLayeredProjectSimulation.dataAccess.abstracts.UserDao;
import nLayeredProjectSimulation.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private ConfirmationService confirmationService;

	public UserManager(UserDao userDao, ConfirmationService confirmationService) {
		this.userDao = userDao;
		this.confirmationService = confirmationService;
	}

	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}

	@Override
	public User get(int userId) {
		return this.userDao.get(userId);
	}

	@Override
	public void add(User user) {
		this.confirmationService.send(user.getEmail(), "Before exploring the our universe, please confirm your E-Mail by writing the 'CONFIRM'\n");
		this.userDao.add(user);

		return;
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
	}

}
