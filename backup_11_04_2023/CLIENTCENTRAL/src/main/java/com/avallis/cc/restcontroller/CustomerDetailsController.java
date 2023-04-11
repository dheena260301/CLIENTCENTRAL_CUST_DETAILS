package com.avallis.cc.restcontroller;

import java.util.ArrayList;import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.avallis.cc.dao.AdviserStaffRepository;
import com.avallis.cc.dao.CustomerCoreDetailsRepository;
import com.avallis.cc.dao.CustomerDetailsRepository;
import com.avallis.cc.modal.AdviserStaff;
import com.avallis.cc.modal.CustomerCoreDetails;
import com.avallis.cc.modal.CustomerDetails;
import com.avallis.cc.service.CustomerDetailsService;


@Controller
public class CustomerDetailsController {

	
	@Autowired
    private CustomerDetailsRepository customerDetailsRepository;	

	@Autowired
	private CustomerCoreDetailsRepository customerCoreDetailsRepository;

	@Autowired
	private AdviserStaffRepository adviserStaffRepository;

	@Autowired
	private CustomerDetailsService serv;

	// Find all customer Details
	@GetMapping("/customers")
	public List<CustomerDetails> listAll(Model model) {
		System.out.println("inside the customers");
		 List<CustomerDetails> listCustomers = customerDetailsRepository.findAll();
		 CustomerDetails cd = listCustomers.get(0);
		 System.out.println("listCustomer------"+cd.getClass().toString());
		 return listCustomers;
	}

	

	// getting Customer Deatails by CustomerId
	@GetMapping("/getById")
	public CustomerDetails fingByCustId(Model model, @RequestParam("custId") String custId) {
		System.out.println("Find By Id");
	    return customerDetailsRepository.findById(custId).get();
	}

	// for update customerDetails by customer Id
	@PostMapping("/saveCustDetById")
	public String saveCustDetById(@RequestBody CustomerDetails customerDetails) {
		System.out.println("inside the saveCustDetById");
		System.out.println("customerDetails.to String----------------" + customerDetails.toString());
		System.out.println("customerDetails---custId" + customerDetails.getCustId());
		System.out.println("customerDetails---agentIdCurrent" + customerDetails.getAgentIdCurrent());
		 customerDetailsRepository.save(customerDetails);
		return "Saved";
	}

	// for update customer core details by custCoreId
	@GetMapping("/getByCustCoreId")
	public CustomerCoreDetails findByCustCoreId(Model model, @RequestParam("custCoreId") String custCoreId) {
		System.out.println("Find By Id");
		return customerCoreDetailsRepository.findById(custCoreId).get();
	}

	// update custCoreDetails
	@PostMapping("/updCoreCustomer")
	public String updCustCoreDet(@RequestBody CustomerCoreDetails customerCoreDetails) {
		System.out.println("inside the updateCustomerCoreDetails");
		System.out.println("customerCoreDetails-------------" + customerCoreDetails);
		customerCoreDetailsRepository.save(customerCoreDetails);
		return "SUCCESS";
	}

	// getting adviserstaff details by advisertype
	@GetMapping("/getNyAdvstfType/{staffType}")
	public List<AdviserStaff> getadvByTyp(Model model, @PathVariable("staffType") String staffType) {
		System.out.println("get Adviser By Adviser StaffType");
		List<AdviserStaff> adviserStaffDet = adviserStaffRepository.findByStaffType(staffType);
		return adviserStaffDet;
	}
 
	// update customerDetails by NRIC
	@PutMapping("/updateColumnName/{bdayCallDays}/{custNRIC}")
	public String updateByNric(@PathVariable("bdayCallDays") String bdayCallDays,
			@PathVariable("custNRIC") String custNRIC) {
		Integer ll = serv.update(bdayCallDays, custNRIC);
		return "hi";

	}

	// update CustomerDetails By Nric and Current Adviser
	@PostMapping("/updateByNricAndAgentIdCurr/{bdayCallDays}/{custNRIC}/{agentIdCurrent}")
	public String updateByNricAndAgentIdCurr(@PathVariable("bdayCallDays") String bdayCallDays,
			                                 @PathVariable("custNRIC") String custNRIC, @PathVariable("agentIdCurrent") String agentIdCurrent) {
		serv.updateByNricAndAgentId(bdayCallDays, custNRIC, agentIdCurrent);
		return "SUCCESS";
	}
	
	
	//get advstf id and advName for dropDownList
	@GetMapping("/getAdvstfNameAndCustNric")
	public ModelAndView getAllAdvStffList(){
		ModelAndView mv=new ModelAndView("CustomerDetailsList");
	    List<AdviserStaff> advStfLst=new ArrayList<AdviserStaff>();
	    serv.listAllAdvisers().forEach(advStfLst1->advStfLst.add(advStfLst1));
	    mv.addObject("allAdvisersList",advStfLst);
	    
	    List<String> custNricLst = new ArrayList<String>();
		custNricLst = serv.lstAllCustNric();
		mv.addObject("custNricList",custNricLst);
		
        return mv;
	} 		
		
		// get Customerdetails by Adviser Staff name and NRIC
		@GetMapping("/getCustDetailsByAdfStfAndNric")
		@ResponseBody
		public List<CustomerDetails> lstCustomerDetails(@RequestParam String agentIdCurrent,@RequestParam String custNric) {			
			
	     	String strAgentIdCurrent = agentIdCurrent;
	     	String strCustNric = custNric;		
	     	
			List<CustomerDetails> custDetList = new ArrayList<>();
			
			if((!strAgentIdCurrent.isEmpty())&&(!strCustNric.isEmpty() )) {
				custDetList = serv.lstCustDetByAgentIdCurrentAndCustNric(strAgentIdCurrent, strCustNric);
				}
			else if((strAgentIdCurrent.isEmpty())&&(!strCustNric.isEmpty())) {
				custDetList = customerDetailsRepository.findByCustNRIC(strCustNric);
				}
			else if((!strAgentIdCurrent.isEmpty())&& (strCustNric.isEmpty())){
				custDetList = customerDetailsRepository.findByAgentIdCurrent(strAgentIdCurrent);
			}			
			return custDetList;
			
		}
		
		
	

}
