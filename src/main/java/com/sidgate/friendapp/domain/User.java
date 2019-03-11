package com.sidgate.friendapp.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String firstName;

	private String lastName;

	private String email;

	private String phoneNumber;

	private String password;

	private LocalDate dob;
}
