package com.phoenix.domain.service;

import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.phoenix.domain.dto.UserLoginRequestDto;
import com.phoenix.domain.dto.UserRegistrationRequestDto;
import com.phoenix.domain.dto.UserRegistrationResponseDto;
import com.phoenix.domain.entity.User;
import com.phoenix.domain.exception.UserNotFoundException;
import com.phoenix.domain.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;

	public UserRegistrationResponseDto addUser(UserRegistrationRequestDto userRegistrationRequestDto)
			throws FileUploadException {
		userRegistrationRequestDto.setPassword(passwordEncoder.encode(userRegistrationRequestDto.getPassword()));
		return UserRegistrationResponseDto.toUserRegistrationResponseDto(
				userRepository.save(UserRegistrationRequestDto.toUser(userRegistrationRequestDto)));
	}

	public UserRegistrationResponseDto getUser(int userId) {
		try {
		return UserRegistrationResponseDto.toUserRegistrationResponseDto(userRepository.findById(userId));
		}catch(RuntimeException e) {
			throw new UserNotFoundException("User not found");
		}
	}

	public Object login(UserLoginRequestDto userLoginRequestDto) {
		try {
			User user = userRepository.findByEmail(userLoginRequestDto.getEmail());
			if(passwordEncoder.matches(userLoginRequestDto.getPassword(), user.getPassword())) {
				return "Login successful";
			}else {
				return "Invalid password";
			}
		}catch(RuntimeException e) {
			throw new UserNotFoundException("User not found");
		}
	}
}
