package com.dor.couponsproject.repositories;

import com.dor.couponsproject.entities.CouponEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CouponRepository extends JpaRepository<CouponEntity,Long> {

    List<CouponEntity> getCouponsByCompanyId (Long companyId);

    List<CouponEntity> getCouponsByCustomersId (Long customerId);
}
