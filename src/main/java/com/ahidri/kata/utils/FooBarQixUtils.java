package com.ahidri.kata.utils;

/**
 * Created by ahidri on 23/03/16.
 */
public class FooBarQixUtils {

    public static boolean isMultipleOf(Integer number, Integer factor) {
        return number % factor == 0;
    }

    public static boolean isNotEmpty(String stringToChek){
        return stringToChek != null && !stringToChek.isEmpty();
    }
}
