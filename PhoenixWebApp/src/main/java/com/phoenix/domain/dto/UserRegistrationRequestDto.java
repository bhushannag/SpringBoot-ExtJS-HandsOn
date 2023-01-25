package com.phoenix.domain.dto;

import java.sql.Date;

import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.springframework.web.multipart.MultipartFile;

import com.phoenix.domain.entity.Address;
import com.phoenix.domain.entity.CompanyDetails;
import com.phoenix.domain.entity.User;
import com.phoenix.domain.entity.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationRequestDto {
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String password;
	private Date dob;
	private String occupation;
	private String jobType;
	private String jobDescription;
	private String companyName;
	private String companyInfo;
	private String companyCountry;
	private String companyState;
	private String companyCity;
	private String companyLandMark;
	private String companyStreet;
	private int companyPincode;
	private String userCountry;
	private String userState;
	private String userCity;
	private String userLandMark;
	private String userStreet;
	private int userPincode;
	private MultipartFile thumbnail;
	private boolean isApplicationApproved;

	public static User toUser(UserRegistrationRequestDto userRegistrationRequestDto) throws FileUploadException {
		User user = new User();
		UserDetails userDetails = new UserDetails();
		userDetails.setFirstName(userRegistrationRequestDto.getFirstName());
		userDetails.setMiddleName(userRegistrationRequestDto.getMiddleName());
		userDetails.setLastName(userRegistrationRequestDto.getLastName());
		user.setEmail(userRegistrationRequestDto.getEmail());
		user.setPassword(userRegistrationRequestDto.getPassword());
		userDetails.setDob(userRegistrationRequestDto.getDob());
		userDetails.setOccupation(userRegistrationRequestDto.getOccupation());
		userDetails.setJobType(userRegistrationRequestDto.getJobType());
		userDetails.setJobDescription(userRegistrationRequestDto.getJobDescription());
		CompanyDetails companyDetails = new CompanyDetails();
		companyDetails.setCompanyName(userRegistrationRequestDto.getCompanyName());
		companyDetails.setCompanyInfo(userRegistrationRequestDto.getCompanyInfo());
		Address companyAddress = new Address();
		companyAddress.setCountry(userRegistrationRequestDto.getCompanyCountry());
		companyAddress.setState(userRegistrationRequestDto.getCompanyState());
		companyAddress.setCity(userRegistrationRequestDto.getCompanyCity());
		companyAddress.setStreet(userRegistrationRequestDto.getCompanyStreet());
		companyAddress.setLandMark(userRegistrationRequestDto.getCompanyLandMark());
		companyAddress.setPincode(userRegistrationRequestDto.getCompanyPincode());
		companyDetails.setCompanyAddress(companyAddress);
		userDetails.setCompanyDetails(companyDetails);
		Address userAddress = new Address();
		userAddress.setCountry(userRegistrationRequestDto.getUserCountry());
		userAddress.setState(userRegistrationRequestDto.getUserState());
		userAddress.setCity(userRegistrationRequestDto.getUserCity());
		userAddress.setStreet(userRegistrationRequestDto.getUserStreet());
		userAddress.setLandMark(userRegistrationRequestDto.getUserLandMark());
		userAddress.setPincode(userRegistrationRequestDto.getUserPincode());
		userDetails.setUserAddress(userAddress);
		//user.setThumbnail(FileUtils.save(userRegistrationRequestDto.getThumbnail()));
		userDetails.setApplicationApproved(userRegistrationRequestDto.isApplicationApproved());
		user.setUserDetails(userDetails);
		return user;
	}
}
