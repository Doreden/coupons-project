package com.dor.couponsproject.services;

import com.dor.couponsproject.entities.CompanyEntity;
import com.dor.couponsproject.repositories.CompanyRepository;
import com.dor.couponsproject.repositories.CouponRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class AdminService {
    private final CompanyRepository companyRep;
    private final CouponRepository couponRep;

    public boolean isCompanyExists(String email, String password) {
        CompanyEntity company = companyRep.existByEmail(email);
        return (company.getPassword().equals(password));
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
        Optional<CompanyEntity> companyOpt = companyRep.findById(companyID);
        if (companyOpt.isEmpty()) {
            return null;
        }
        return companyOpt.get();
    }

    public List<CompanyEntity> getAllCompanies(){
        return companyRep.findAll();
    }
}
