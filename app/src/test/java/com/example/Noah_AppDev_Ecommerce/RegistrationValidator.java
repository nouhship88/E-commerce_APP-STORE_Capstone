package com.example.Noah_AppDev_Ecommerce;

 class RegistrationValidator {

    public static boolean validateInput(String name, String Phone, String password){

        return !(name.equals(null) || Phone.isEmpty());
    }


 }
