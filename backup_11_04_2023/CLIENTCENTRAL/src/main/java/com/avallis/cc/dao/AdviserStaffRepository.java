package com.avallis.cc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avallis.cc.modal.AdviserStaff;

public interface AdviserStaffRepository extends JpaRepository<AdviserStaff, String>{

	List<AdviserStaff> findByStaffType(String staffType);
	
	//AdviserStaff findByAdvstfId(String agentIdCurrent);

}
