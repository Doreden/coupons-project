package com.dor.couponsproject.errors.exceptions;

import com.dor.couponsproject.entities.CouponEntity;

public class CouponExpirationDatePassed extends ApplicationException {
    public CouponExpirationDatePassed(CouponEntity coupon) {
        super("This coupon: " + coupon.getTitle() + " has expired!");
    }
}
