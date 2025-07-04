package com.f_rafael.junitproject_lucas_moy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> getNumbers() {
        List<String> numbers = new ArrayList<>();
        for(int i=1;i<100;i++){
            if(i % 3 == 0){
                numbers.add("Fizz");
            }else{
                numbers.add(String.valueOf(i));
            }
        }
        return numbers;
    }
}
