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
@Table(name="CUSTOMER_CORE_DETAILS")
public class CustomerCoreDetails {
	
	@Id
	@Column(name="CUST_CORE_ID")
	private String custCoreId;
	
	@Column(name="CORE_CUST_NAME")
	private String coreCustName;
	
	@Column(name="CORE_CUST_NRIC")
	private String coreCustNric;
	
	@Column(name="CORE_CUST_DOB")
	private Date coreCustDob;
	
	@Column(name="CORE_CUST_GENDER")
	private String coreCustGender;
	
	@Column(name="CREATED_DATE")
	private Date createdDate;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;
	
	@Column(name="MODIFIED_BY")
	private String modifiedBy;
	
	@Column(name="DISTRIBUTOR_ID")
	private String distribnutorId;
	
	@Column(name="DISTRIBUTOR_NAME")
	private String distributorName;
	
	@Column(name="CORE_CUST_FIN")
	private String coreCustyFin;
	
	@Column(name="CORE_CUST_PASPORT_NUM")
	private String coreCustPassportNum;
	
	
	

}
