package com.dor.couponsproject.util;

import com.dor.couponsproject.entities.CompanyEntity;
import com.dor.couponsproject.entities.CouponEntity;
import com.dor.couponsproject.entities.CustomerEntity;

import java.util.Optional;

public class OptionalToEntityConverterUtil {

    public static CompanyEntity optionalCompany(final Optional<CompanyEntity> company) {

        return company.orElse(null);
    }

    public static CustomerEntity optionalCustomer(final Optional<CustomerEntity> customer) {

        return customer.orElse(null);
    }

    public static CouponEntity optionalCoupon(final Optional<CouponEntity> coupon) {

        return coupon.orElse(null);
    }
}
