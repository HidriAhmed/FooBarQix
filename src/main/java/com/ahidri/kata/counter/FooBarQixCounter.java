package com.ahidri.kata.counter;

import com.ahidri.kata.utils.ConsoleDisplayer;
import com.ahidri.kata.utils.FooBarQixUtils;

/**
 * Created by ahidri on 23/03/16.
 */
public class FooBarQixCounter {

    public static final String THREE = "3";
    public static final String SEVEN = "7";
    public static final String FIVE = "5";
    public static final String FOO = "Foo";
    public static final String BAR = "Bar";
    public static final String QIX = "Qix";

    private ConsoleDisplayer consoleDisplayer = ConsoleDisplayer.getInstance();

    public void count() {
        for (Integer i = 1; i <= 100; i++) {
            consoleDisplayer.display(i);
        }

    }

    public String replaceThreeByFoo(String number) {
        if(number.contains(THREE)){
            return number.replaceAll(THREE, FOO);
        }
        return "";

    }

    public String replaceFiveByBar(String number) {
        if(number.contains(FIVE)) {
            return number.replaceAll(FIVE, BAR);
        }
        return "";
    }

    public String replaceSevenByQix(String number) {
        if (number.contains(SEVEN)) {
            return number.replaceAll(SEVEN, QIX);
        }
        return "";
    }

    public String returnFooIfDivisibleBy3(Integer number) {
        if(FooBarQixUtils.isMultipleOf(number, 3)){
            return FOO;
        }
        return "";
    }

    public String returnFooIfDivisibleBy5(Integer number) {
        if(FooBarQixUtils.isMultipleOf(number, 5)){
            return BAR;
        }
        return "";
    }

    public String returnQixIfDivisibleBy7(Integer number) {
        if(FooBarQixUtils.isMultipleOf(number, 7)){
            return QIX;
        }
        return "";
    }
}
