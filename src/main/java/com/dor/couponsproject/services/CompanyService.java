package com.dor.couponsproject.services;

import com.dor.couponsproject.dto.CouponDTO;
import com.dor.couponsproject.entities.CompanyEntity;
import com.dor.couponsproject.entities.CouponEntity;
import com.dor.couponsproject.enums.EntityType;
import com.dor.couponsproject.errors.Constraint;
import com.dor.couponsproject.errors.Exceptions.*;
import com.dor.couponsproject.repositories.CompanyRepository;
import com.dor.couponsproject.repositories.CouponRepository;
import com.dor.couponsproject.util.CouponUtil;
import com.dor.couponsproject.util.ObjectMappingUtil;
import com.dor.couponsproject.util.OptionalToEntityConverterUtil;
import com.dor.couponsproject.util.UserInputValidationUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
@Slf4j
public class CompanyService {
    private final CompanyRepository companyRep;
    private final CouponRepository couponRep;

    public CouponEntity createCoupon(final CouponDTO couponDto) throws ApplicationException {

        //Checking if the specific coupon is already exist to current company
        for (CouponEntity coupon : couponRep.findAll()) {
            if (coupon.getTitle().equals(couponDto.getTitle()) &&
                    Objects.equals(coupon.getCompany().getId(), couponDto.getCompanyID())) {
                throw new EntityExistException(EntityType.COUPON, Constraint.ENTITY_ALREADY_EXISTS);
            }
        }

        //Checking if the date format is valid according to Date REGEX
        if (!UserInputValidationUtil.isDateValid((couponDto.getStartDate()))
                || !UserInputValidationUtil.isDateValid((couponDto.getEndDate()))) {
            throw new UserValidationException(Constraint.INVALID_INPUT_FORMAT);
        }

        //Checking if the end date entered is valid according to today's Date
        if (CouponUtil.isCouponExpired(couponDto.getEndDate())) {
            throw new CouponExpirationDatePassed(ObjectMappingUtil.couponDtoToEntity(couponDto));
        }

        //Checking if the end date entered is before start Date
        if (couponDto.getEndDate().isBefore(couponDto.getStartDate())) {
            throw new InvalidEndDateException(Constraint.START_DATE_AT_OR_BEFORE_END_DATE);
        }

        //Converting couponDto to spring coupon entity
        CouponEntity coupon = ObjectMappingUtil.couponDtoToEntity(couponDto);

        //Creating the coupon entity on our database
        CouponEntity newCoupon = couponRep.save(coupon);
        log.info("A new coupon: " + newCoupon.getTitle() + " has been created successfully");

        //Setting a company object to a variable
        CompanyEntity company = OptionalToEntityConverterUtil.
                optionalCompany(companyRep.
                        findById(newCoupon.
                                getCompany().
                                getId()));

        List<CouponEntity> companyCoupons = new ArrayList<>();
        //Adding and setting the company coupons
        companyCoupons.add(newCoupon);
        company.setCoupons(companyCoupons);

        return newCoupon;
    }

    public void deleteCoupon(final Long couponId) throws ApplicationException {

        //Setting a coupon according to the coupon id
        CouponEntity coupon = OptionalToEntityConverterUtil.optionalCoupon(couponRep.findById(couponId));

        //Checking if the specific coupon is not exist
        if (coupon == null) {
            throw new EntityDoesNotExistException(EntityType.COUPON, Constraint.ENTITY_NOT_EXISTS);
        }

        //Converting a coupon to a couponDto entity
        CouponDTO couponDto = ObjectMappingUtil.couponEntityToDto(coupon);

        log.info("The selected coupon: " + couponDto.getTitle() + "," + " has been deleted");

        //Deleting the coupon from our database by its id
        couponRep.deleteById(couponId);
    }
}
