package com.dor.couponsproject.errors.Exceptions;

import com.dor.couponsproject.entities.CouponEntity;

public class CouponExpirationDatePassed extends ApplicationException {
    public CouponExpirationDatePassed(CouponEntity coupon) {
        super("This coupon: " + coupon.getTitle() + " has expired!");
    }
}
