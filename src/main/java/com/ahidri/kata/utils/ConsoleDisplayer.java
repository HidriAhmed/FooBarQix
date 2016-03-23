package com.ahidri.kata.utils;

/**
 * Created by ahidri on 23/03/16.
 */
public class ConsoleDisplayer {

    private static final ConsoleDisplayer instance = new ConsoleDisplayer();

    private ConsoleDisplayer(){}

    public static ConsoleDisplayer getInstance(){
        return instance;
    }

    public void display(String msgToDisplay){
        System.out.println(msgToDisplay);
    }
}
