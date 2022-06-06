package com.dor.couponsproject.repositories;

import com.dor.couponsproject.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {

    CompanyEntity findByEmail(String email);

    CompanyEntity findByName(String name);

    CompanyEntity existByEmail(String email);
}
