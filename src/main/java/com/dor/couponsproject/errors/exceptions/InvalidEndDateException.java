package com.dor.couponsproject.errors.exceptions;

import com.dor.couponsproject.errors.Constraint;

public class InvalidEndDateException extends ApplicationException {
    public InvalidEndDateException(final Constraint constraint) {
        super(constraint.getErrorMsg());
    }
}
