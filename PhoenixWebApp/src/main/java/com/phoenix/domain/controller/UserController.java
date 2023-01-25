package com.phoenix.domain.controller;

import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phoenix.domain.dto.UserLoginRequestDto;
import com.phoenix.domain.dto.UserRegistrationRequestDto;
import com.phoenix.domain.dto.UserRegistrationResponseDto;
import com.phoenix.domain.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PreAuthorize(value="")
	@PostMapping("/addUser")
	public ResponseEntity<UserRegistrationResponseDto> userRegistration(@RequestBody UserRegistrationRequestDto userRegistrationRequestDto) throws FileUploadException{
		System.out.println(userRegistrationRequestDto);
		return new ResponseEntity<UserRegistrationResponseDto>(userService.addUser(userRegistrationRequestDto) , HttpStatus.CREATED);
	}
		
	@GetMapping("/getUser/{id}")
	public ResponseEntity<UserRegistrationResponseDto> getUser(@PathVariable("id") int userId){
		return new ResponseEntity<UserRegistrationResponseDto>(userService.getUser(userId) , HttpStatus.OK);
	}
	
	@GetMapping("/login")
	public ResponseEntity<?> userLogin(UserLoginRequestDto userLoginRequestDto){
		return new ResponseEntity<>(userService.login(userLoginRequestDto) , HttpStatus.OK);
	}

}
