package com.avallis.cc.modal;
import java.math.BigDecimal;import java.util.Date;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 

@Entity
@Table(name = "CUSTOMER_DETAILS")
public class CustomerDetails {
    @Id
    @Column(name = "CUSTID")   
    private String custId;
    
    @Column(name="CUST_NAME")    
    private String customerName;    
   
    @Column(name="NRIC")
    private String custNRIC;
    
    @Column(name="CUST_CATEG")
    private String custCateg;
    
    @Column(name="CUST_INITIALS")
    private String custInitials;
    
    @Column(name="BDAY_CALL_OPTION")
    private String bdayCallOption;
    
    @Column(name="BDAY_CALL_DAYS")
    private String bdayCallDays;
    
    @Column(name="CUST_STATUS")
    private String custStatus;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    @Column(name="AGENT_ID_INITIAL")
    private String agentIdInitial;
    
    
    //@ManyToOne(fetch = FetchType.LAZY)
    @Column(name="AGENT_ID_CURRENT")    
    private String agentIdCurrent;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    @Column(name="DISTRIBUTOR_ID")
    private String distributorId;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    @Column(name="CUSTOMER_STATUS_ID")
    private String customerStatusId;
    
    //@ManyToOne(fetch = FetchType.LAZY)
    @Column(name="CUST_CORE_ID")
    private String custCoreId;
    
    @Column(name="HOUSE_HLD_HEAD_FLG")
    private String houseHoldFlg;
    
    @Column(name="COMPANY_NAME")
    private String companyName;
    
    @Column(name="OCCPN_TITLE")
    private String occpnTitle;
    
    @Column(name="OCCPN_DESC")
    private String occpnDesc;
    
    @Column(name="ADDRESS_PREF")
    private String addressPref;
    
    @Column(name="RES_ADDR1")
    private String resAddress1;
    
    @Column(name="RES_ADDR2")
    private String resAddress2;
    
    @Column(name="RES_ADDR3")
    private String resAddress3;
    
    @Column(name="RES_CITY")
    private String resCity;
    
    @Column(name="RES_STATE")
    private String resState;
    
    @Column(name="RES_COUNTRY")
    private String resCountry;
    
    @Column(name="RES_POSTALCODE")
    private String resPostalcode;
    
    @Column(name="RES_FAX")
    private String resFax;
    
    @Column(name="RES_PH")
    private String resPh;
    
    @Column(name="RES_HAND_PHONE")
    private String resHandPhone;
    
    @Column(name="OFF_ADDR1")
    private String offAddr1;
    
    @Column(name="OFF_ADDR2")
    private String offAddr2;
    
    @Column(name="OFF_ADDR3")
    private String offAddr3;
    
    @Column(name="OFF_CITY")
    private String offCity;
    
    @Column(name="OFF_STATE")
    private String offState;
    
    @Column(name="OFF_COUNTRY")
    private String offCountry;
    
    @Column(name="OFF_POSTALCODE")
    private String offPostalcode;
    
    @Column(name="OFF_PH")
    private String offPh;
    
    @Column(name="OFF_HAND_PHONE")
    private String offHandPhone;
    
    @Column(name="OFF_FAX")
    private String offFax;
    
    @Column(name="COR_ADDR1")
    private String corAddr1;
    
    @Column(name="COR_ADDR2")
    private String corAddr2;
    
    @Column(name="COR_ADDR3")
    private String corAddr3;
    
    @Column(name="COR_CITY")
    private String corCity;
    
    @Column(name="COR_STATE")
    private String corState;
    
    @Column(name="COR_COUNTRY")
    private String corCountry;
    
    @Column(name="COR_POSTALCODE")
    private String corPostalcode;
    
    @Column(name="OTH_PH")
    private String othPh;
    
    @Column(name="DOB")
    private Date dob;
    
    @Column(name="MARITAL_STATUS")
    private String maritalStatus;
    
    @Column(name="SEX")
    private String sex;
    
    @Column(name="EMAIL_ID")
    private String emailId;
    
    @Column(name="WEBSITE")
    private String website;
    
    @Column(name="REFERRAL_FLG")
    private String referralFlg;
    
    @Column(name="REFERRAL_SOURCE")
    private String referralSource;
    
    @Column(name="REFERRAL_CUST_ID")
    private String referralCustId;
    
    @Column(name="REFERRAL_CUST_NAME")
    private String referralCustName;
    
    @Column(name="REFERRAL_CUST_NRIC")
    private String referralCustNric;
    
    @Column(name="SMOKER_FLG")
    private String smokerFlg;
    
    @Column(name="RACE")
    private String race;
    
    @Column(name="NATIONALITY")
    private String nationality;
    
    @Column(name="TITLE")
    private String title;
    
    @Column(name="WEIGHT")
    private String weight;
    
    @Column(name="HEIGHT")
    private String height;
    
    @Column(name="ACADEMIC_TITLE")
    private String academicTitle;
    
    @Column(name="INCOME")
    private BigDecimal income;
    
    @Column(name="REMARKS")
    private String remarks;
    
    @Column(name="CREATED_DATE")
    private Date createdDate;
    
    @Column(name="MODIFIED_DATE")
    private Date modifiedDate;
    
    @Column(name="CREATED_BY")
    private String createdBy;
    
    @Column(name="MODIFIED_BY")
    private String modifiedBy;
    
    @Column(name="STATUS_FLG")
    private String statusFlg;
    
    
    @Column(name="DISTRIBUTOR_NAME")
    private String distributorName;
    
    
    @Column(name="REFERRAL_ADV_ID")
    private String referralAdvId;
    
    @Column(name="REFERRAL_ADV_NAME")
    private String referralAdvName;
    
    @Column(name="REFERRAL_ADV_NRIC")
    private String referralAdvNric;
    
    @Column(name="CONTACT_PREF")
    private String contactPref;
    
    @Column(name="OTH_HAND_PHONE")
    private String othHandPhone;
    
    @Column(name="OTH_FAX")
    private String othFax;
    
    @Column(name="BLCK_LST_FLG")
    private String blckLstFlg;
    
    @Column(name="GST_TYPE")
    private String gstType;
    
    @Column(name="ROC_DATE")
    private Date rocDate;
    
    @Column(name="ROC_NO")
    private String rocNo;
    
    @Column(name="RELIGION")
    private String RELIGION;
    
    @Column(name="CUST_FIN")
    private String custFin;
    
    @Column(name="CUST_PASSPORT_NUM")
    private String custPassportNum;
    
    @Column(name="RISK_LEVEL")
    private String riskLevel;
    
    @Column(name="RISK_START_DATE")
    private Date riskStartDate;
    
    @Column(name="RISK_END_DATE")
    private Date riskEndDate;
    
    @Column(name="RISK_PRCNT")
    private String riskPrcnt;
    
    @Column(name="RISK_REMARKS")
    private String riskRemarks;
    
    @Column(name="DO_NOT_CALL")
    private String doNotCall;
    
    @Column(name="SOURCE_DATA")
    private String sourceData;
    
    @Column(name="DM_REMARKS")
    private String dmRemarks;
    
    @Column(name="GI_CUST_FLG")
    private String giCustFlg;
    
    @Column(name="DO_NOT_COMMUNICATE")
    private String doNotCommunicate;
    
    @Column(name="BUSINESS_NATR")
    private String bussinessNair;
    
    @Column(name="CITIZENSHIP")
    private String citizenship;
    
    @Column(name="BUSINESS_NATR_DETS")
    private String bussinessNairDets;
    
    
    @Column(name="TYPE_OF_PROSPECT")
    private String typeOfProspect;
    
    @Column(name="COUNTRY_OF_BIRTH")
    private String countryOfBirth;
    
    @Column(name="TYPEOFPDT")
    private String typeOfPdt;
    
    @Column(name="RACE_OTHER")
    private String raceOther;
    
    @Column(name="FNATYPE")
    private String fnatype;
	
    
	/*
	 * @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	 * 
	 * @JoinTable(name = "customer_details_CUSTOMER_CORE_DETAILS", joinColumns =
	 * { @JoinColumn(name = "CUSTOMER_DETAILS_CUSTID") }, inverseJoinColumns =
	 * { @JoinColumn(name = "CUSTOMER_CORE_DETAILS_CORE_CORE_ID") }) private
	 * List<CustomerCoreDetails> CustomerCoreDetails;
	 * 
	 * @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	 * 
	 * @JoinTable(name = "customer_details_Adviser_Staff", joinColumns =
	 * { @JoinColumn(name = "customer_details_custid") }, inverseJoinColumns =
	 * { @JoinColumn(name = "AdviserStaff_AdvStaffId") }) private List<AdviserStaff>
	 * AdviserStaff;
	 */

    
}


//TEMP_CUSTID_FPMS06_DM






