package world.belto.ai.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import world.belto.ai.api.model.User;


@Service
public class UserService {

	
	private List<User> userList;
	
	
	public UserService (List<User> user_list) {
		this.userList = user_list;
		
		User user1 = new User(1);
		User user2 = new User(2);
		User user3 = new User(3);
		User user4 = new User(4);
		User user5 = new User(5);
		
		userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
		
	}
	
	
	
	public Optional<User> getUser(Integer id) {
		Optional optional = Optional.empty();
		for (User user : userList) {
			if(id == user.getId()) {
				optional = Optional.of(user);
				return optional;
			}
		}
		return optional;
	}
	
	
	
	
	
	
	
	
	
	
}
