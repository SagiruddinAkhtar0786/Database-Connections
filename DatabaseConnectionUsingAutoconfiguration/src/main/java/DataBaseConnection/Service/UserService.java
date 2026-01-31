package DataBaseConnection.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DataBaseConnection.Entity.User;
import DataBaseConnection.Repository.userReposiory;

@Service
public class UserService {
	
	@Autowired
	userReposiory userRepo;
	
	public List<User> fetchDetails() {
		List<User> list = userRepo.findAll();
		for(User u : list)
			System.out.println(u);
		System.out.println(list.toString());
		return list;
	}
	
	public User createUser(User user) {
		User singleuser = userRepo.save(user);
		return singleuser;
	}
}
