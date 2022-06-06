package com.dor.couponsproject.dto;

import com.dor.couponsproject.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CouponDTO {

    private long id;
    private Category category;
    private String title;
    private String descreption;
    private Date  startDate;
    private Date endDate;
    private int amount;
    private double price;
    private String image;

}
