package com.phoenix.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	private String country;
	private String state;
	private String city;
	private String landMark;
	private String street;
	private int pincode;
	@OneToOne(mappedBy = "userAddress")
	@JsonBackReference
	private UserDetails userAddressId;
	@OneToOne(mappedBy = "companyAddress")
	@JsonBackReference
	private CompanyDetails companyAddressId;
}
