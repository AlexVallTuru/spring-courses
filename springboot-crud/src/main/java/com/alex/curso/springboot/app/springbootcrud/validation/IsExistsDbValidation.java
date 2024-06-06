package com.alex.curso.springboot.app.springbootcrud.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alex.curso.springboot.app.springbootcrud.services.ProductService;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

@Component
public class IsExistsDbValidation implements ConstraintValidator<isExistsDb, String>{

    @Autowired
    private ProductService service;
    
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return !service.existsBySku(value);
    }
 
}