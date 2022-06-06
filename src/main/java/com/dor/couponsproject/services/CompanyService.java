package com.dor.couponsproject.services;

import com.dor.couponsproject.dto.CompanyDTO;
import com.dor.couponsproject.model.Company;
import com.dor.couponsproject.repositories.CompanyRepository;
import com.dor.couponsproject.util.ObjectsMappingUtil;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Builder

// Add this Class as a bean class = making a singleton object of him.
@Service

// Using the class: CompanyRepository as a CTOR injection,
@RequiredArgsConstructor

public class CompanyService {
    // Class Variable:
    private final CompanyRepository companyRepository;

    //* Company Methods: *//
    // Check if company exists by  Method:
    public boolean isCompanyExists(String email, String password){
        return false;
    }

    // Create a new company and add it to DB table Method:
    public long createCompany(final Company company){
            return companyRepository.save(company).getId();
    }

    // Update an Existing company parameters and add it to DB table Method:
    public CompanyDTO updateCompany(final CompanyDTO companyDTO){
    final Company companyEntity = ObjectsMappingUtil.companyDTOtoCompanyEntity(companyDTO);
    final Company companyToUpdate = companyRepository.save(companyEntity);
    return ObjectsMappingUtil.companyEntityToCompanyDTO(companyEntity);
    }

    public void deleteCompany(final long companyID){
        companyRepository.deleteById(companyID);
    }

    public Company getOneCompany(final long companyID){
        Optional<Company> companyOpt  = companyRepository.findById(companyID);
        if (companyOpt.isEmpty()) {
            return null;
        }
        return companyOpt.get();
    }

    public List<Company> getAllCompanies(){
        return companyRepository.findAll();
    }
}
