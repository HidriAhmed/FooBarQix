package com.ahidri.kata.counter;

import com.ahidri.kata.counter.FooBarQixCounter;
import com.ahidri.kata.utils.ConsoleDisplayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.never;
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
    public void should_count_from_1_to100() {
        //given


        //when
        fooBarQixCounter.count();

        //then
        for (Integer i = 1; i <= 100; i++) {
            verify(consoleDisplayer, times(1)).display(i);
        }
    }

    @Test
    public void should_not_display_number_lower_than_1_or_greater_than_100() {
        //given


        //when
        fooBarQixCounter.count();

        //then
        verify(consoleDisplayer, never()).display(AdditionalMatchers.geq(new Integer(101)));
        verify(consoleDisplayer, never()).display(AdditionalMatchers.leq(new Integer(0)));
    }

    @Test
    public void should_replace_3_by_Foo_for_33(){
        //given

        //when
        String result = fooBarQixCounter.replaceThreeByFoo("33");

        //then
        assertThat(result).isEqualTo("FooFoo");
    }

    @Test
    public void should_3_by_Foo_for_13(){
        //given

        //when
        String result = fooBarQixCounter.replaceThreeByFoo("13");

        //then
        assertThat(result).isEqualTo("1Foo");
    }

    @Test
    public void should_5_by_Foo_for_55(){
        //given

        //when
        String result = fooBarQixCounter.replaceFiveByBar("55");

        //then
        assertThat(result).isEqualTo("BarBar");
    }

    @Test
    public void should_replace_5_by_Bar_for_50(){
        //given

        //when
        String result = fooBarQixCounter.replaceFiveByBar("50");

        //then
        assertThat(result).isEqualTo("Bar0");
    }

    @Test
    public void should_7_by_Qix_for_77(){
        //given

        //when
        String result = fooBarQixCounter.replaceSevenByQix("77");

        //then
        assertThat(result).isEqualTo("QixQix");
    }

    @Test
    public void should_replace_7_by_Qix_for_70(){
        //given

        //when
        String result = fooBarQixCounter.replaceSevenByQix("70");

        //then
        assertThat(result).isEqualTo("Qix0");
    }

    @Test
    public void should_replace_number_divisible_by_3_by_Foo_for_3(){
        //given

        //when
        String result = fooBarQixCounter.returnFooIfDivisibleBy3(3);

        //then
        assertThat(result).isEqualTo("Foo");
    }

    @Test
    public void should_replace_number_divisible_by_3_by_Foo_for_33(){
        //given

        //when
        String result = fooBarQixCounter.returnFooIfDivisibleBy3(33);

        //then
        assertThat(result).isEqualTo("Foo");
    }

    @Test
    public void should_replace_number_divisible_by_3_by_Foo_for_13(){
        //given

        //when
        String result = fooBarQixCounter.returnFooIfDivisibleBy3(13);

        //then
        assertThat(result).isEmpty();
    }

    @Test
    public void should_replace_number_divisible_by_5_by_Bar_for_5(){
        //given

        //when
        String result = fooBarQixCounter.returnFooIfDivisibleBy5(5);

        //then
        assertThat(result).isEqualTo("Bar");
    }

    @Test
    public void should_replace_number_divisible_by_5_by_Bar_for_55(){
        //given

        //when
        String result = fooBarQixCounter.returnFooIfDivisibleBy5(55);

        //then
        assertThat(result).isEqualTo("Bar");
    }

    @Test
    public void should_replace_number_divisible_by_5_by_Bar_for_51(){
        //given

        //when
        String result = fooBarQixCounter.returnFooIfDivisibleBy5(51);

        //then
        assertThat(result).isEmpty();
    }
}
