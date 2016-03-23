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
            String valueToDisplay = computeValueToDisplay(i);
            consoleDisplayer.display(valueToDisplay);
        }

    }

    String replaceThreeByFoo(String number) {
        if (number.contains(THREE)) {
            return number.replaceAll(THREE, FOO);
        }
        return "";

    }

    String replaceFiveByBar(String number) {
        if (number.contains(FIVE)) {
            return number.replaceAll(FIVE, BAR);
        }
        return "";
    }

    String replaceSevenByQix(String number) {
        if (number.contains(SEVEN)) {
            return number.replaceAll(SEVEN, QIX);
        }
        return "";
    }

    String replaceDigitByCorrespondingConstant(Integer number){
        String result;
        if(number < 40){
            result = replaceThreeByFoo(number.toString())
                    + replaceFiveByBar(number.toString())
                    + replaceSevenByQix(number.toString());

        }
        else if(number < 60) {
            result = replaceFiveByBar(number.toString())
                    + replaceThreeByFoo(number.toString())
                    + replaceSevenByQix(number.toString());
        }
        else {
            result = replaceSevenByQix(number.toString())
                    + replaceFiveByBar(number.toString())
                    + replaceThreeByFoo(number.toString());
        }
        return result.replaceAll("\\d", "");
    }

    String returnFooIfDivisibleBy3(Integer number) {
        if (FooBarQixUtils.isMultipleOf(number, 3)) {
            return FOO;
        }
        return "";
    }

    String returnFooIfDivisibleBy5(Integer number) {
        if (FooBarQixUtils.isMultipleOf(number, 5)) {
            return BAR;
        }
        return "";
    }

    String returnQixIfDivisibleBy7(Integer number) {
        if (FooBarQixUtils.isMultipleOf(number, 7)) {
            return QIX;
        }
        return "";
    }

    String computeValueToDisplay(Integer number) {
        String computedValue = returnFooIfDivisibleBy3(number)
                + returnFooIfDivisibleBy5(number)
                + returnQixIfDivisibleBy7(number)
                + replaceDigitByCorrespondingConstant(number);
        return FooBarQixUtils.isNotEmpty(computedValue) ? computedValue : number.toString();
    }
}
