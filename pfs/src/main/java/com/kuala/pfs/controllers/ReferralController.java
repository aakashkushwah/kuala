package com.kuala.pfs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kuala.pfs.model.entity.Referral;
import com.kuala.pfs.services.ReferralService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/api/v1")
@RestController
@Slf4j
public class ReferralController {
	
	@Autowired
	private ReferralService referralService;
	
	@GetMapping("/referrals")
	public List<Referral> getAllReferrals() {
		return referralService.getAllReferrals();
	}

}
