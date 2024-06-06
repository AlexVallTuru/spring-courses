package com.alex.curso.springboot.app.springbootcrud.validation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Constraint(validatedBy = IsExistsDbValidation.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface isExistsDb {
	String message() default "ya existe en la base de datos!";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
