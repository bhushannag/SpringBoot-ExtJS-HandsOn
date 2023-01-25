package com.phoenix.domain.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int companyId;
	private String companyName;
	private String companyInfo;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="companyAddressId")
	@JsonManagedReference
	private Address companyAddress;
	@OneToOne(mappedBy = "companyDetails")
	@JsonBackReference
	private UserDetails userCompanyId;
}
