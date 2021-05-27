package com.idealogics.mylibrary;

/**
 * Created by FA on 5/27/2021.
 */
public class Validation {


    public static boolean isValidEmail(String email)
    {

        if (email.length()>0){
            return true;
        }
        else {
            return  false;
        }

    }
}

