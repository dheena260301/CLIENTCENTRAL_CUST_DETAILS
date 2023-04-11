package com.avallis.cc.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.avallis.cc.dao.AdviserStaffRepository;
import com.avallis.cc.dao.CustomerDetailsRepository;
import com.avallis.cc.modal.AdviserStaff;
import com.avallis.cc.modal.CustomerDetails;

@Service
@Transactional
public class CustomerDetailsService {
 
	@Autowired
    private CustomerDetailsRepository customerDetailsRepository;
	
	@Autowired
	private AdviserStaffRepository adviserStaffRepository;

  
    public Integer update(String c,String n) {
    	return customerDetailsRepository.updateByNric(c,n);
//    	return 1;
    }
    
    public void updateByNricAndAgentId(String bdayCallDays, String custNRIC, String agentIdCurrent) {
		customerDetailsRepository.updateByNricAndAgentId(bdayCallDays, custNRIC, agentIdCurrent);
		
	}

	public List<AdviserStaff> listAllAdvisers() {
		List<AdviserStaff> allAdvstfList = adviserStaffRepository.findAll();
		return allAdvstfList;
	}

	public List<String> lstAllCustNric() {
		List<String> custNricList = customerDetailsRepository.findDistinctCustNRIC();
		return custNricList;
	}
	
	public List<CustomerDetails> lstCustDetByAgentIdCurrentAndCustNric(String agentIdCurrent,String custNRIC){
		List<CustomerDetails> custDetList = customerDetailsRepository.findByAgentIdCurrentAndCustNRIC(agentIdCurrent, custNRIC);
		return custDetList;
	}


	
}