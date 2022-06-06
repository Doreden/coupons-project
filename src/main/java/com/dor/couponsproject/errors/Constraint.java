package com.dor.couponsproject.errors;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Constraint {

    START_DATE_AT_OR_BEFORE_END_DATE("End date cannot be before startDate!"),

    INVALID_DATE("The inserted date of current coupon is invalid"),

    ENTITY_NOT_EXISTS(" does not exist!"),

    ENTITY_ALREADY_EXISTS(" already exists!"),

    INVALID_INPUT_FORMAT("Invalid input - Please input according to the correct format"),

    ENTITY_NAME_EXISTS("This company name already exists! It is not allowed to update a company name!");

    @Getter
    private final String errorMsg;
}