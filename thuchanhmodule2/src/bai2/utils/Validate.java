package bai2.utils;

import java.util.regex.Pattern;

public class Validate {
    public static final String PHONE ="/^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$/";
    public static final String EMAIL ="^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";

    public static boolean PhoneValid(String phone) {
        return Pattern.compile(PHONE).matcher(phone).matches();
    }



    public static boolean EmailValid(String email) {
        return Pattern.compile(EMAIL).matcher(email).matches();
    }
}
