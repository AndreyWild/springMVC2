package com.wild.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) // задаем область применения - поле класса
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class) // с каким классом работает
public @interface CheckEmail {

    public String value() default "xyz.com";

    public String message() default "email must ends with xyz.com";

    public Class<?>[] groups() default {}; // помогает разбивать аннотации по группам

    public Class<? extends Payload>[] payload() default {}; // перенос информации о метаданных клиента
}
