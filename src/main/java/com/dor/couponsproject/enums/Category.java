package com.dor.couponsproject.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Enumerated;

@Getter
@AllArgsConstructor
public enum Category {

    FOOD,
    ELECTRICITY,
    RESTAURANT,
    JUNKFOOD,
    VACATION,
    BEVERAGE,
    CLOTHING,
    SHOES;
}
