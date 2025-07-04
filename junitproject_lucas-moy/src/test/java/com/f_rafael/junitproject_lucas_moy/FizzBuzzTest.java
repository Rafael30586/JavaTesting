package com.f_rafael.junitproject_lucas_moy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {

    private FizzBuzz game;

    @Before
    public void before(){
        game = new FizzBuzz();
    }

    @Test
    public void should_returnNumbers_whenNotAMultiplyOf3Or5(){
        //FizzBuzz game = new FizzBuzz();
        List<String> numbersList = game.getNumbers();
        Assert.assertEquals("1", numbersList.get(0));
        Assert.assertEquals("2", numbersList.get(1));
        Assert.assertEquals("7", numbersList.get(6));
        Assert.assertEquals("13", numbersList.get(12));
    }

    @Test
    public void should_returnFizz_whenMultiplyOf3(){
        //FizzBuzz game = new FizzBuzz();
        List<String> numbersList = game.getNumbers();
        Assert.assertEquals("Fizz", numbersList.get(2));
        Assert.assertEquals("Fizz", numbersList.get(5));
        Assert.assertEquals("Fizz", numbersList.get(8));
        Assert.assertEquals("Fizz", numbersList.get(11));
    }
}
