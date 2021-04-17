package com.wild.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator
        implements ConstraintValidator
        <CheckEmail, String> { // аннотация и тип данных к которому буду применять аннотацию

    private String andOfEmail;
    @Override
    public void initialize(CheckEmail checkEmail) {
        andOfEmail = checkEmail.value(); // получили конец email (@interface CheckEmail)

    }

    @Override
    public boolean isValid(String enteredValue, // значение которое будет вводиться в форму
                           ConstraintValidatorContext constraintValidatorContext) {
        // если введенное значение равно окончанию значения в параметре аннотации
        return enteredValue.endsWith(andOfEmail);
    }
}
