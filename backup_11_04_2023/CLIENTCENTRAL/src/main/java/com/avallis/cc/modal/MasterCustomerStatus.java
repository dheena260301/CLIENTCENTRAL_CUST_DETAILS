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
@Table(name="MASTER_CUSTOMER_STATUS")
public class MasterCustomerStatus {
	
	@Id
	@Column(name="CUSTOMER_STATUS_ID")
	private String customerStatusId;
	
	@Column(name="CUSTOMER_STATUS_DESC")
	private String customerStatusDesc;
	
	@Column(name="CUSTOMER_STATUS_NAME")
	private String customerStatusName;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="CREATED_DATE")
	private Date createdDate;
	
	@Column(name="MODIFIED_BY")
	private String modifiedBy;
	
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;
	
	
}
