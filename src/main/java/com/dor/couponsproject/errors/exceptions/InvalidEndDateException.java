package com.dor.couponsproject.errors.Exceptions;

import com.dor.couponsproject.errors.Constraint;

public class InvalidEndDateException extends ApplicationException {
    public InvalidEndDateException(final Constraint constraint) {
        super(constraint.getErrorMsg());
    }
}
