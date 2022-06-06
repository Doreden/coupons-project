package com.dor.couponsproject.util;

import com.dor.couponsproject.dto.CompanyDTO;
import com.dor.couponsproject.dto.CouponDTO;
import com.dor.couponsproject.dto.CustomerDTO;
import com.dor.couponsproject.entities.CompanyEntity;
import com.dor.couponsproject.entities.CouponEntity;
import com.dor.couponsproject.entities.CustomerEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ObjectMappingUtil {

    public static CompanyEntity companyDtoToEntity(final CompanyDTO companyDto) {
        return CompanyEntity.builder()
                .id(companyDto.getId())
                .name(companyDto.getName())
                .email(companyDto.getEmail())
                .password(companyDto.getPassword())
                .build();
    }

    public static CompanyDTO companyEntityToDto(final CompanyEntity company) {
        return CompanyDTO.builder()
                .id(company.getId())
                .name(company.getName())
                .email(company.getEmail())
                .password(company.getPassword())
                .build();
    }

    public static CustomerEntity customerDtoToEntity(final CustomerDTO customerDTO) {
        return CustomerEntity.builder()
                .id(customerDTO.getId())
                .firstName(customerDTO.getFirstName())
                .lastName(customerDTO.getLastName())
                .email(customerDTO.getEmail())
                .password(customerDTO.getPassword())
                .build();
    }

    public static CustomerDTO customerEntityToDto(final CustomerEntity customer) {
        return CustomerDTO.builder()
                .id(customer.getId())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .email(customer.getEmail())
                .password(customer.getPassword())
                .build();
    }

    public static CouponEntity couponDtoToEntity(final CouponDTO couponDTO) {
        return CouponEntity.builder()
                .id(couponDTO.getId())
                .category(couponDTO.getCategory())
                .title(couponDTO.getTitle())
                .description(couponDTO.getDescription())
                .startDate(couponDTO.getStartDate())
                .endDate(couponDTO.getEndDate())
                .amount(couponDTO.getAmount())
                .price(couponDTO.getPrice())
                .image(couponDTO.getImage())
                .build();
    }

    public static CouponDTO couponEntityToDto(final CouponEntity coupon) {
        return CouponDTO.builder()
                .id(coupon.getId())
                .category(coupon.getCategory())
                .title(coupon.getTitle())
                .description(coupon.getDescription())
                .startDate(coupon.getStartDate())
                .endDate(coupon.getEndDate())
                .amount(coupon.getAmount())
                .price(coupon.getPrice())
                .image(coupon.getImage())
                .build();
    }
}
