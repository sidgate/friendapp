package com.sidgate.friendapp.interfaces.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserRequest {
	private String firstName;

	private String lastName;

	private String email;

	private String phoneNumber;

	private String password;

	private LocalDate dob;
}
