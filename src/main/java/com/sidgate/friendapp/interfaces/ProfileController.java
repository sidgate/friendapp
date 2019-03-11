package com.sidgate.friendapp.interfaces;

import com.sidgate.friendapp.domain.User;
import com.sidgate.friendapp.interfaces.model.UserRequest;
import com.sidgate.friendapp.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/profiles")
@AllArgsConstructor
public class ProfileController {

	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<User> createProfile(@Valid UserRequest request){
		User user = userService.createUser(request);
		return ResponseEntity.created(URI.create("/profiles/"+user.getId())).body(user);
	}
}
