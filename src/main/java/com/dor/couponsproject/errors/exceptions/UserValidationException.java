package com.dor.couponsproject.errors.Exceptions;

import com.dor.couponsproject.errors.Constraint;

public class UserValidationException extends ApplicationException {
    public UserValidationException(final Constraint constraint) {
        super(constraint.getErrorMsg());
    }
}
