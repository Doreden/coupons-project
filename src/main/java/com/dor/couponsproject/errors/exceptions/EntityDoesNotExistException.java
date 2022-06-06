package com.dor.couponsproject.errors.exceptions;

import com.dor.couponsproject.enums.EntityType;
import com.dor.couponsproject.errors.Constraint;

public class EntityDoesNotExistException extends ApplicationException {
    public EntityDoesNotExistException(final EntityType entityType, final Constraint constraint) {
        super(entityType + constraint.getErrorMsg());
    }
}
