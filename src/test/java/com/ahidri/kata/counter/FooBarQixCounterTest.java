package com.ahidri.kata.counter;

import com.ahidri.kata.counter.FooBarQixCounter;
import com.ahidri.kata.utils.ConsoleDisplayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by ahidri on 22/03/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class FooBarQixCounterTest {

    @Mock
    ConsoleDisplayer consoleDisplayer;

    @InjectMocks
    private FooBarQixCounter fooBarQixCounter;

    @Test
    public void should_count_from_0_to100() {
        //given


        //when
        fooBarQixCounter.count();

        //then
        for (Integer i = 1; i <= 100; i++) {
            verify(consoleDisplayer, times(1)).display(i.toString());
        }
    }
}
