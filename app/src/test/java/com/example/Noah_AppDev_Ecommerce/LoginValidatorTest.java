package com.example.Noah_AppDev_Ecommerce;

import org.junit.Test;

public class LoginValidatorTest {

    @Test
    public void whenNameInvalid(){
        String name = "Noah";
        String phone="0925049942";
        String pass="AsDfGh123";

        boolean result = RegistrationValidator.validateInput(name,phone,pass);
        assert(result);

    }
    @Test
    public void whenPhoneInvalid(){
        String name = "Noah";
        String phone="0925049942";
        String pass="AsDfGh123";

        boolean result = RegistrationValidator.validateInput(name,phone,pass);
        assert(result);

    }

    @Test
    public void whenPasswordInvalid(){
        String name = "Noah";
        String phone="0925049942";
        String pass="AsDfGh123";

        boolean result = RegistrationValidator.validateInput(name,phone,pass);
        assert(result);

    }
}
