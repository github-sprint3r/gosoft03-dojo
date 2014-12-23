package gosoft03;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();
    
    @Test
    public void number_1_should_count_1() {
        String expectedResult = "1";
        String actualResult = fizzBuzz.count(1);
        checkCountResult(expectedResult, actualResult);
        
    }

    private void checkCountResult(String expectedResult, String actualResult) {
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void number_2_should_count_2() {
        String expectedResult = "2";
        String actualResult = fizzBuzz.count(2);
        checkCountResult(expectedResult, actualResult);
    }
    
    @Test
    public void number_3_should_count_Fizz() {
        String expectedResult = "Fizz";
        String actualResult = fizzBuzz.count(3);
        checkCountResult(expectedResult, actualResult);
    }
    
    @Test
    public void number_5_should_count_Buzz() {
        String expectedResult = "Buzz";
        String actualResult = fizzBuzz.count(5);
        checkCountResult(expectedResult, actualResult);
    }
    @Test
    public void number_6_should_count_Fizz() {
        String expectedResult = "Fizz";
        String actualResult = fizzBuzz.count(6);
        checkCountResult(expectedResult, actualResult);
    }
    
    @Test
    public void number_10_should_count_Buzz() {
        String expectedResult = "Buzz";
        String actualResult = fizzBuzz.count(10);
        checkCountResult(expectedResult, actualResult);
    }
    
    @Test
    public void number_15_should_count_FizzBuzz() {
        String expectedResult = "FizzBuzz";
        String actualResult = fizzBuzz.count(15);
        checkCountResult(expectedResult, actualResult);
    }
}
