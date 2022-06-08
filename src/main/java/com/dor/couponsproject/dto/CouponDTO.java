package com.dor.couponsproject.dto;

import com.dor.couponsproject.enums.Category;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;

@Data
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CouponDTO {

    private Long id;
    private Long companyID;
    public Category category;
    private String title;
    private String description;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate startDate;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate endDate;
    private int amount;
    private double price;
    private String image;
}
