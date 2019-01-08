package com.molice.validater;


import com.molice.service.HelloService;

import javax.annotation.Resource;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author molice
 */
public class MyConstraintValidator implements ConstraintValidator<MyConstraint,Object> {
    @Resource
    private HelloService helloService;

    @Override
    public void initialize(MyConstraint constraintAnnotation) {
        System.out.println("my validator init");
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        helloService.greeting("molice");

        System.out.println(value);
        return false;
    }
}
