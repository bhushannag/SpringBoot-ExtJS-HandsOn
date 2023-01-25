package com.phoenix.domain.dto;

import java.sql.Date;

import com.phoenix.domain.entity.Address;
import com.phoenix.domain.entity.CompanyDetails;
import com.phoenix.domain.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationResponseDto {
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String password;
	private Date dob;
	private String occupation;
	private String jobType;
	private String jobDescription;
	private CompanyDetails companyDetails;
	private Address userAddress;
	private String thumbnail;
	private boolean isApplicationApproved;
	
	public static UserRegistrationResponseDto toUserRegistrationResponseDto(User user) {
		UserRegistrationResponseDto userRegistrationResponseDto = new UserRegistrationResponseDto();
		userRegistrationResponseDto.setId(user.getId());
		userRegistrationResponseDto.setFirstName(user.getUserDetails().getFirstName());
		userRegistrationResponseDto.setMiddleName(user.getUserDetails().getMiddleName());
		userRegistrationResponseDto.setLastName(user.getUserDetails().getLastName());
		userRegistrationResponseDto.setEmail(user.getEmail());
		userRegistrationResponseDto.setPassword(user.getPassword());
		userRegistrationResponseDto.setDob(user.getUserDetails().getDob());
		userRegistrationResponseDto.setOccupation(user.getUserDetails().getOccupation());
		userRegistrationResponseDto.setJobType(user.getUserDetails().getJobType());
		userRegistrationResponseDto.setJobDescription(user.getUserDetails().getJobDescription());
		userRegistrationResponseDto.setCompanyDetails(user.getUserDetails().getCompanyDetails());
		userRegistrationResponseDto.setUserAddress(user.getUserDetails().getUserAddress());
		userRegistrationResponseDto.setThumbnail(user.getUserDetails().getThumbnail());
		userRegistrationResponseDto.setApplicationApproved(user.getUserDetails().isApplicationApproved());
		return userRegistrationResponseDto;
	}
}
