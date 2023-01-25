package com.phoenix.domain.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private Date dob;
	private String occupation;
	private String jobType;
	private String jobDescription;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userCompanyId")
	private CompanyDetails companyDetails;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "userAddressId")
	private Address userAddress;
	private String thumbnail;
	private boolean isApplicationApproved;
	@OneToOne(mappedBy = "userDetails")
	@JsonBackReference
	private User userDetailsId;

}
