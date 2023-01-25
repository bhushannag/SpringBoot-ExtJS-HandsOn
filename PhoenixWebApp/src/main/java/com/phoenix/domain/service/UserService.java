package com.phoenix.domain.service;

import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phoenix.domain.dto.UserRegistrationRequestDto;
import com.phoenix.domain.dto.UserRegistrationResponseDto;
import com.phoenix.domain.exception.UserNotFoundException;
import com.phoenix.domain.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public UserRegistrationResponseDto addUser(UserRegistrationRequestDto userRegistrationRequestDto)
			throws FileUploadException {
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
}
