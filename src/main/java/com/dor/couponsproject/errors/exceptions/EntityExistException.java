package com.dor.couponsproject.errors.Exceptions;

import com.dor.couponsproject.enums.EntityType;
import com.dor.couponsproject.errors.Constraint;

public class EntityExistException extends ApplicationException {
    public EntityExistException(final EntityType entityType, final Constraint constraint) {
        super(entityType + constraint.getErrorMsg());
    }
}
