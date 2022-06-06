package com.dor.couponsproject.util;

import com.dor.couponsproject.dto.CompanyDTO;
import com.dor.couponsproject.dto.CouponDTO;
import com.dor.couponsproject.dto.CustomerDTO;
import com.dor.couponsproject.model.Company;
import com.dor.couponsproject.model.Coupon;
import com.dor.couponsproject.model.Customer;
import lombok.Builder;
import lombok.Data;

import java.sql.Date;

@Builder
@Data
public class ObjectsMappingUtil {


    //* Coupon Object Converting Methods: *//
    // Convert CouponDTO Object To Coupon Entity Method:
    public static Coupon couponDTOToCouponEntity(final CouponDTO couponDTO){
        return Coupon.builder()
                .id(couponDTO.getId())
                .title(couponDTO.getTitle())
                .description(couponDTO.getDescreption())
                .category(couponDTO.getCategory())
                .startDate(couponDTO.getStartDate())
                .endDate(couponDTO.getEndDate())
                .amount(couponDTO.getAmount())
                .price(couponDTO.getPrice())
                .image(couponDTO.getImage())
                .build();
    }
    // Convert Coupon Entity To CouponDTO Method:
    public static CouponDTO couponEntityToCouponDTO(final Coupon coupon){
        return CouponDTO.builder()
                .id(coupon.getId())
                .title(coupon.getTitle())
                .descreption(coupon.getDescription())
                .category(coupon.getCategory())
                .startDate(coupon.getStartDate())
                .endDate(coupon.getEndDate())
                .amount(coupon.getAmount())
                .price(coupon.getPrice())
                .image(coupon.getImage())
                .build();
    }

    //* Company Object Converting Methods: *//
    // Convert CompanyDTO to Company Entity Method:
    public static Company companyDTOtoCompanyEntity(final CompanyDTO companyDTO){
        return  Company.builder()
                .id(companyDTO.getId())
                .name(companyDTO.getName())
                .email(companyDTO.getEmail())
                .password(companyDTO.getPassword())
                .build();
    }

    // Convert Company Entity To CompanyDTO Method:
    public static CompanyDTO companyEntityToCompanyDTO(final Company company){
        return CompanyDTO.builder()
                .id(company.getId())
                .name(company.getName())
                .email(company.getEmail())
                .password(company.getPassword())
                .build();
    }

    //* Customer Object Converting Methods: *//
    // Convert CustomerDTO to Customer Entity Method:
    public static Customer CustomerDTOToCustomerEntity(final CustomerDTO customerDTO){
        return Customer.builder()
                .id(customerDTO.getId())
                .firstName(customerDTO.getFirstName())
                .lastName(customerDTO.getLastName())
                .email(customerDTO.getEmail())
                .password(customerDTO.getPassword())
                .build();
    }


    // Convert Customer to CustomerDTO Entity Method:
    public static CustomerDTO customerEntityToCustomerDTO(final Customer customer){
        return CustomerDTO.builder()
                .id(customer.getId())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .email(customer.getEmail())
                .password(customer.getPassword())
                .build();
    }
}
