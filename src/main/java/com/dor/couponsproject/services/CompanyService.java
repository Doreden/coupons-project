package com.dor.couponsproject.services;

import com.dor.couponsproject.entities.CompanyEntity;
import com.dor.couponsproject.repositories.CompanyRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Builder
@Service
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyRepository companyRep;

    public boolean isCompanyExists(String email, String password){

        return false;
    }

    public Long createCompany(final CompanyEntity company) {
            companyRep.save(company);

        return company.getId();

    }

    public void updateCompany(final CompanyEntity companyToUpdate){
        companyRep.save(companyToUpdate);
    }

    public void deleteCompany(final long companyID){
        companyRep.deleteById(companyID);
    }

    public CompanyEntity getOneCompany(final long companyID){
        Optional<CompanyEntity> companyOpt  = companyRep.findById(companyID);
        if (companyOpt.isEmpty()) {
            return null;
        }
        return companyOpt.get();
    }

    public List<CompanyEntity> getAllCompanies(){
        return companyRep.findAll();
    }
}
