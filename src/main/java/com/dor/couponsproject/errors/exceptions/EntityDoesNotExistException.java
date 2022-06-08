package com.dor.couponsproject.errors.Exceptions;

import com.dor.couponsproject.enums.EntityType;
import com.dor.couponsproject.errors.Constraint;
import com.dor.couponsproject.errors.Exceptions.ApplicationException;

public class EntityDoesNotExistException extends ApplicationException {
    public EntityDoesNotExistException(final EntityType entityType, final Constraint constraint) {
        super(entityType + constraint.getErrorMsg());
    }
}
