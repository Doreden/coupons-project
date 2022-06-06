package com.dor.couponsproject.repositories;

import com.dor.couponsproject.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends JpaRepository<Coupon,Long> {

}
