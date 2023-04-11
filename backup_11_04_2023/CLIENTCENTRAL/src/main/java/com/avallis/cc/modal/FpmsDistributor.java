package com.avallis.cc.modal;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor 
@Entity
@Table(name = "FPMS_DISTRIBUTOR")
public class FpmsDistributor {
	 
	@Id
	@Column(name = "DISTRIBUTOR_ID")
	private String distributorId;
	
	@Column(name="MNEMONIC")
	private String mnemonic;
	
	@Column(name="DISTRBUTOR_NAME")
	private String distributorName;
	
	@Column(name="ADDR1")
	private String addr1;
	
	@Column(name="ADDR2")
	private String addr2;
	
	@Column(name="ADDR3")
	private String addr3;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="PINCODE")
	private String pincode;
	
	@Column(name="TELEPHONE_OFF")
	private String telephoneOff;
	
	@Column(name="TELEPHONE_RES")
	private String telephoneRes;
	
	@Column(name="FAX_NO")
	private String faxNo;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="CONTACT_REF")
	private String contactRef;
	
	@Column(name="REGISTRATION_NO")
	private String registrationNo;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="CREATED_DATE")
	private Date createdDate;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="MODIFIED_BY")
	private String modifiedBy;
	
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;
	
	@Column(name="PARENT_YN")
	private String parentYn;
	
	@Column(name="PARENT_NAME")
	private String parenrtName;
	
	@Column(name="PREVIOUS_NAME")
	private String previousName;
	
	@Column(name="NAME_PERIOD_FROM")
	private String namePriodFrom;
	
	@Column(name="NAME_PERIOD_TO")
	private String newPeriodTo;
	
	@Column(name="LOGIN_APPEAR")
	private String loginAppear;
	
	@Column(name="GST_FLG")
	private String gstFlg;
	
	@Column(name="WEBSITE")
	private String website;
	
	
	

}
