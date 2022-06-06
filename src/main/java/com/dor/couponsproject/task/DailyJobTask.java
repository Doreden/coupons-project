package com.dor.couponsproject.task;

import com.dor.couponsproject.entities.CouponEntity;
import com.dor.couponsproject.errors.exceptions.ApplicationException;
import com.dor.couponsproject.repositories.CouponRepository;
import com.dor.couponsproject.services.CompanyService;
import com.dor.couponsproject.util.CouponUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

@EnableScheduling
@RequiredArgsConstructor
@Slf4j
public class DailyJobTask {

    private final CouponRepository couponRepository;
    private final CompanyService companyService;

    @Scheduled(fixedDelay = 86400000)
    public void deleteExpiredCoupons() {

        List<CouponEntity> coupons = couponRepository.findAll();

        log.info("Thread: " + Thread.currentThread().getName() + " started to run");

        for (CouponEntity coupon : coupons) {

            if (CouponUtil.isCouponExpired(coupon.getEndDate())) {

                try {
                    companyService.deleteCoupon(coupon.getId());
                } catch (ApplicationException e) {
                    log.error(e.getMessage());
                }

                log.info("The coupon: " + coupon.getTitle() +
                        " has been deleted due to its expiration date: " + coupon.getEndDate());
            }
        }
    }
}