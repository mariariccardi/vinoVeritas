package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Company;

@Repository
@Transactional

public interface CompanyRepository extends CrudRepository<Company,Long> {
	


}
