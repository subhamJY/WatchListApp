package com.example.subham.watchlist.Entity.validations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = priorityLogic.class)
public @interface Priority {

	String message() default "Please set L , M , H only ";
	Class<?>[]groups() default {};
	Class<? extends Payload>[] payload() default {};
}
