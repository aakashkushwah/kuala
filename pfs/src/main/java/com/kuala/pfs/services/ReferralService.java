package com.kuala.pfs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuala.pfs.model.entity.Referral;
import com.kuala.pfs.repo.ReferralRepository;

@Service
public class ReferralService {
	
	@Autowired
	private ReferralRepository referralRepository;
	
	
	public List<Referral> getAllReferrals() {
		return referralRepository.findAll();
	}
	
	

}
