package com.ahidri.kata.counter;

import com.ahidri.kata.utils.ConsoleDisplayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyString;
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
            verify(consoleDisplayer, times(100)).display(anyString());
    }

    @Test
    public void should_not_display_number_lower_than_1_or_greater_than_100() {
        //given


        //when
        fooBarQixCounter.count();

        //then
        verify(consoleDisplayer, never()).display("101");
        verify(consoleDisplayer, never()).display("0");
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

    @Test
    public void should_replace_number_divisible_by_7_by_Bar_for_7(){
        //given

        //when
        String result = fooBarQixCounter.returnQixIfDivisibleBy7(7);

        //then
        assertThat(result).isEqualTo("Qix");
    }

    @Test
    public void should_replace_number_divisible_by_7_by_Qix_for_77(){
        //given

        //when
        String result = fooBarQixCounter.returnQixIfDivisibleBy7(77);

        //then
        assertThat(result).isEqualTo("Qix");
    }

    @Test
    public void should_replace_number_divisible_by_7_by_Qix_for_17(){
        //given

        //when
        String result = fooBarQixCounter.returnQixIfDivisibleBy7(17);

        //then
        assertThat(result).isEmpty();
    }

    @Test
    public void should_replace_75_by_QixBar(){
        //given

        //when
        String result = fooBarQixCounter.replaceDigitByCorrespondingConstant(75);

        //then
        assertThat(result).isEqualTo("QixBar");
    }

    @Test
    public void should_replace_57_by_BarQix(){
        //given

        //when
        String result = fooBarQixCounter.replaceDigitByCorrespondingConstant(57);

        //then
        assertThat(result).isEqualTo("BarQix");
    }

    @Test
    public void should_compute_value_to_display_for_53(){
        //given

        //when
        String result = fooBarQixCounter.computeValueToDisplay(53);

        //then
        assertThat(result).isEqualTo("BarFoo");
    }

    @Test
    public void should_compute_value_to_display_for_13(){
        //given

        //when
        String result = fooBarQixCounter.computeValueToDisplay(13);

        //then
        assertThat(result).isEqualTo("Foo");
    }

    @Test
    public void should_compute_value_to_display_for_15(){
        //given

        //when
        String result = fooBarQixCounter.computeValueToDisplay(15);

        //then
        assertThat(result).isEqualTo("FooBarBar");
    }

    @Test
    public void should_compute_value_to_display_for_33(){
        //given

        //when
        String result = fooBarQixCounter.computeValueToDisplay(33);

        //then
        assertThat(result).isEqualTo("FooFooFoo");
    }
}
