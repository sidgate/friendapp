package com.sidgate.friendapp.services;

import com.sidgate.friendapp.UserRepository;
import com.sidgate.friendapp.domain.User;
import com.sidgate.friendapp.interfaces.model.UserRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User createUser(UserRequest request) {
		User user = User.builder().firstName(request.getFirstName()).lastName(request.getLastName()).dob(request.getDob()).email(request.getEmail()).build();
		return userRepository.save(user);
	}
}
