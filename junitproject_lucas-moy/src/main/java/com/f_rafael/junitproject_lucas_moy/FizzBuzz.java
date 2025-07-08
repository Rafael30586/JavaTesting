package com.f_rafael.junitproject_lucas_moy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    // public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public List<String> getNumbers() {
        List<String> numbers = new ArrayList<>();
        for(int i=1;i<100;i++){
            getNumber(i);
        }
        return numbers;
    }

    private static String getNumber(int i) {
        String number = String.valueOf(i);
        if(isMultiple(i,3) && isMultiple(i,5)){
            return FIZZ + BUZZ;
        }else if(isMultiple(i,3)){
            return FIZZ;
        }else if(isMultiple(i,5)){
            return BUZZ;
        }else{
            return String.valueOf(i);
        }
    }

    private static boolean isMultiple(int value, int multiple) {
        return value % multiple == 0;
    }
}
