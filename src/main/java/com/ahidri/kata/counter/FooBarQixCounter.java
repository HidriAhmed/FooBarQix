package com.ahidri.kata.counter;

import com.ahidri.kata.utils.ConsoleDisplayer;

/**
 * Created by ahidri on 23/03/16.
 */
public class FooBarQixCounter {

    private ConsoleDisplayer consoleDisplayer = ConsoleDisplayer.getInstance();

    public void count() {
        for (Integer i = 1; i <= 100; i++) {
            consoleDisplayer.display(i);
        }

    }
}
