package com.dor.couponsproject.errors.exceptions;

import com.dor.couponsproject.errors.Constraint;

public class UserValidationException extends ApplicationException {
    public UserValidationException(final Constraint constraint) {
        super(constraint.getErrorMsg());
    }
}
