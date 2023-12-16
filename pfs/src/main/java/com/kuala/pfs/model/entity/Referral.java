package com.kuala.pfs.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_referral")
public class Referral {
	
	@Id
	@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	@jakarta.persistence.Column(name = "referral_id")
	private Long referralId;
	
	@jakarta.persistence.Column(name = "referral_name")
	private String referralName;
	
	@jakarta.persistence.Column(name = "referral_email")
	private String referralEmail;
	
	@jakarta.persistence.Column(name = "referral_phone")
	private String referralPhone;
	
	@jakarta.persistence.Column(name = "referral_address")
	private String referralAddress;
	
	@jakarta.persistence.Column(name = "referral_city")
	private String referralCity;
	
	@jakarta.persistence.Column(name = "referral_state")
	private String referralState;
	
	@jakarta.persistence.Column(name = "referral_zip")
	private String referralZip;
	
	@jakarta.persistence.Column(name = "referral_country")
	private String referralCountry;
	
	@jakarta.persistence.Column(name = "referral_date")
	private LocalDate referralDate;
	
	@jakarta.persistence.Column(name = "amount_paid")
	private Double amountPaid;
	
	@jakarta.persistence.Column(name = "remarks")
	private String remarks;
	
	@jakarta.persistence.Column(name = "project_code")
	private String projectCode;
	
//	@jakarta.persistence.Column(name = "currency")
//	private String currency;

}
