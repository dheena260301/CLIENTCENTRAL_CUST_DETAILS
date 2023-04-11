package com.avallis.cc.dao;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.avallis.cc.modal.AdviserStaff;
import com.avallis.cc.modal.CustomerDetails;
 
@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, String> {
	

	

	List<CustomerDetails> findByCustNRIC(String custNRIC);
	
	List<CustomerDetails> findByAgentIdCurrent(String agentIdCurrent);
	
	List<CustomerDetails> findByAgentIdCurrentAndCustNRIC(String agentIdCurrent,String custNRIC);

	// String saveAll(List<CustomerDetails> custDetails, String nRIC);
	
	@Transactional
	@Modifying
//	@Query(value = "UPDATE CUSTOMER_DETAILS SET CUST_NAME = :b_call WHERE NRIC = :nric",nativeQuery = true)
	@Query("update CustomerDetails set bdayCallOption = :b_call where custNRIC = :nric")
	public Integer updateByNric(@Param(value="b_call") String bdayCallDays,@Param(value="nric") String custNRIC);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE CUSTOMER_DETAILS SET BDAY_CALL_DAYS = :b_call WHERE NRIC =:nric and AGENT_ID_CURRENT = :agentidcr",nativeQuery = true)
    public void updateByNricAndAgentId(@Param(value="b_call")String bdayCallDays, @Param(value="nric")String custNRIC, @Param(value="agentidcr") String agentIdCurrent);

    @Query("select DISTINCT custNRIC from CustomerDetails")
    List<String> findDistinctCustNRIC();
    
}
    
   

	  

