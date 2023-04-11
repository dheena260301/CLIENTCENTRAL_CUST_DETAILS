package com.avallis.cc.modal;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name="ADVISER_STAFF")
public class AdviserStaff {
	
	@Id
	@Column(name="ADVSTF_ID")
	private String advstfId;
	
	@Column(name="ADVSTF_NAME")
	private String advstfName;
	
    @Column(name="ADVSTF_INITIALS")
    private String advstfInitials;
    
    @Column(name="STAFF_TYPE")
    private String staffType;
    
    @Column(name="NRIC")
    private String nric;
    
    @Column(name="DESIGNATION")
    private String designation;
    
    @Column(name="MANAGER_ID")
    private String managerId;
    
    @Column(name="STARTDATE")
    private Date statedate;
    
    @Column(name="RES_ADDR1")
    private String resAddr1;
    
	@Column(name="RES_ADDR2")
	private String resAddr2;
	
	@Column(name="RES_CITY")
	private String resCity;
	
	@Column(name="RES_STATE")
	private String resState;
	
	@Column(name="RES_COUNTRY")
	private String resCountry;
	
	@Column(name="RES_POSTALCODE")
	private String resPostalcode;
	
	@Column(name="RES_PH")
	private String resPh;
	
	@Column(name="OFF_PH")
	private String offPh;
	
	@Column(name="HAND_PH")
	private String handPh;
	
    @Column(name="EMAIL_ID")
    private String emailId;
    
    @Column(name="FAX")
    private String fax;
    
    @Column(name="DOB")
    private Date dob;
    
    @Column(name="MARITAL_STATUS")
    private String maritalStatus;
    
    @Column(name="SEX")
    private String sex;
    
    @Column(name="SMOKER_FLG")
    private String smokerFlg;
    
    @Column(name="RACE")
    private String race;
    
    @Column(name="NATIONALITY")
    private String nationality;
    
    @Column(name="CARDKEY_NO")
    private String cardkeyNo;
    
    @Column(name="CABINET_NO")
    private String cabinetNo;
    
    @Column(name="TITLE")
    private String title;
    
    @Column(name="PIGEONBOX_NO")
    private String pigeoboxNo;
    
    @Column(name="HOMEDIR_NAME")
    private String homedirName;
    
    @Column(name="REMARKS")
    private String remarks;
    
    @Column(name="KIN_NAME")
    private String kinName;
    
    @Column(name="KIN_NRIC")
    private String kinNric;
    
    @Column(name="KIN_RELATIONS")
    private String kinRelations;
    
    @Column(name="KIN_ADDR1")
    private String kinAddr1;
    
    @Column(name="KIN_ADDR2")
    private String kinAddr2;
    
    @Column(name="KIN_ADDR3")
    private String kinAddr3;
    
    @Column(name="KIN_CITY")
    private String kinCity;
    
    @Column(name="KIN_STATE")
    private String kinState;
    
    @Column(name="KIN_COUNTRY")
    private String kinCountry;
    
    @Column(name="KIN_POSTALCODE")
    private String kinPostalcode;
    
    @Column(name="KIN_RES_PH")
    private String kinResPh;
    
    @Column(name="KIN_OFF_PH")
    private String kinOffPh;
    
    @Column(name="KIN_HAND_PH")
    private String kinHandPh; 
    
    @Column(name="KIN_FAX")
    private String kinFax;    
    
    @Column(name="CREATED_DATE")
    private Date createdDate;
    
    @Column(name="MODIFIED_DATE")
    private Date modifiedDate;
    
    @Column(name="CREATED_BY")
    private String createdBy; 
    
    @Column(name="MODIFIED_BY")
    private String modifiedBy;
    
    @Column(name="REFERRAL_FLG")
    private String referralFlg;
    
    @Column(name="REFERRAL_SOURCE")
    private String referralSource;
    
    @Column(name="SYNC_DATE")
    private String syncDate;
    
    @Column(name="KIN_REMARKS")
    private String kinRemarks;
    
    @Column(name="PROFINS_FLG")
    private String profinFlg;
        
    @Column(name="ADMIN_REMARKS")
    private String adminRemarks;
    
    @Column(name="KIN_SEX")
    private String kinSex;
    
    @Column(name="STATUS_FLG")
    private String statusFlg;
    
    @Column(name="TERMINATION_DATE")
    private String terminationDate;
    
    @Column(name="RECRUIT_TYPE")
    private String recruitType;
    
    @Column(name="DISTRIBUTOR_ID")
    private String distribiutorId;
    
    @Column(name="DESIG_ID")
    private String desigId;
        
    @Column(name="STF_TYP_ID")
    private String stfTypId;
    
    @Column(name="TITLE_CODE")
    private String titleCode;
    
    @Column(name="EMPSTATUS_ID")
    private String empstatusId;
    
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
    
    @Column(name="OFF_POSTALCODE")
    private String offPostalcode;
    
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
    
    @Column(name="BANK_ACC_NO")
    private String bankAccNo;
    
    @Column(name="BANK_NAME")
    private String bankName;
    
    @Column(name="BANK_BRNCH_NAME")
    private String bankBrnchName;
    
    @Column(name="BANK_COUNTRY")
    private String bankCountry;
    
    @Column(name="ADV_LICENSE_NO")
    private String advLicenceNo;
    
    @Column(name="ADV_PERS_EMAILID")
    private String advPersEmailid;
    
    @Column(name="REQD_CPD_HRS")
    private String reqdCpdHrs;
    
    @Column(name="REQD_CPD_HRS_LIFE")
    private String reqdCpdHrsLife;
    
    @Column(name="BASE_DIST_ID")
    private String baseDistId;
    
    @Column(name="TEMP_BROKID_FPMS06_DM")
    private String tempBrokidFpms06Dm;
    
    @Column(name="SOURCE_DATA")
    private String sourceData;
    
    @Column(name="NTUC_FIRMCODE")
    private String ntucFirmcode;	
    
//    @OneToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name="AGENT_ID_CURRENT" )    
//    private List<CustomerDetails> custdetails;
	
	
}

