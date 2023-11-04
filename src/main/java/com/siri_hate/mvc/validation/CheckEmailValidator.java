package com.siri_hate.mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

// 1-й тип это название аннотации
// 2-й тип это тип проверяемых данных
public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {

    private String endOfEmail;

    @Override
    public void initialize(CheckEmail checkEmail) {

        // Получаем значение из поля
        endOfEmail = checkEmail.value();

    }

    @Override
    public boolean isValid(
            String enteredValue,
            ConstraintValidatorContext constraintValidatorContext
    ) {
        // Проверка является ли конец email заданному
        return enteredValue.endsWith(endOfEmail);
    }

}
