package com.converter;

import org.springframework.stereotype.Component;

import com.dto.CompanyDTO;
import com.model.Company;

@Component

public class CompanyConverter extends AbstractConverter<Company, CompanyDTO> {

	@Override
	public Company toEntity(CompanyDTO companyDTO) {
		Company company = null;
		if(companyDTO != null) {
			company = new Company(companyDTO.getId(),companyDTO.getName(),companyDTO.getAddress(),companyDTO.getCity(),companyDTO.getUser());
		}
		return company;
	}
	
	@Override
	public CompanyDTO toDto(Company company) {
		CompanyDTO companyDTO = null;
		if(company != null) {
			companyDTO = new CompanyDTO(company.getId(),company.getName(),company.getAddress(),company.getCity(),company.getUser());
			}
		return companyDTO;
	}
}
