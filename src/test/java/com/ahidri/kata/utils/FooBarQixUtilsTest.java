package com.ahidri.kata.utils;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by ahidri on 23/03/16.
 */
public class FooBarQixUtilsTest {

    private final FooBarQixUtils fooBarQixUtils = new FooBarQixUtils();

    @Test
    public void should_return_true_when_divisible_by_3(){
        //given

        //when
        boolean result =  fooBarQixUtils.isMultipleOf(3, 3);

        //then
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void should_return_false_when_not_divisible_by_3(){
        //given

        //when
        boolean result =  fooBarQixUtils.isMultipleOf(1, 3);

        //then
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void should_return_true_when_divisible_by_5(){
        //given

        //when
        boolean result =  fooBarQixUtils.isMultipleOf(5, 5);

        //then
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void should_return_false_when_not_divisible_by_5(){
        //given

        //when
        boolean result =  fooBarQixUtils.isMultipleOf(1, 5);

        //then
        Assertions.assertThat(result).isFalse();
    }
}