package com.siri_hate.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Можно использовать на поля
@Target(ElementType.FIELD)
// Будет работать вплоть до runtime
@Retention(RetentionPolicy.RUNTIME)
// Привязка класса валидатора
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {

    // Дефолтное значение value если оно не указано в скобках
    public String value() default "xyz.com";

    // Дефолтное значение message если оно не указано в скобках
    public String message() default "email must ends with xyz.com";

    // 1-я обязательная функция
    public Class<?>[] groups() default {};

    // 2-я обязательная функция
    public Class<? extends Payload>[] payload() default {};

}
