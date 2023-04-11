package com.avallis.cc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avallis.cc.modal.CustomerCoreDetails;

@Repository
public interface CustomerCoreDetailsRepository extends JpaRepository<CustomerCoreDetails,String> {

}
