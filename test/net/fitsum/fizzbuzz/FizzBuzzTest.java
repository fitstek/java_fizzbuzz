package net.fitsum.fizzbuzz;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.*;

/**
 * Created by fitsumteklehaimanot on 04/04/15.
 */
public class FizzBuzzTest {

    private FizzBuzz fizzbuzz;

    @BeforeMethod
    public void setUp() throws Exception {
        List<Rule> rules = Arrays.asList(new Rule(3,"Fizz"), new Rule(5,"Buzz"), new Rule(7,"Bang"));
        fizzbuzz = new FizzBuzz(rules);
    }

    @Test
    public void oneReturnsOne() {
        assertEquals("1", fizzbuzz.evaluate(1));
    }

    @Test
    public void twoReturnsTwo() {
        assertEquals("2", fizzbuzz.evaluate(2));
    }

    @Test
    public void multiplesOfThreeReturnFizz() {
        assertEquals("Fizz", fizzbuzz.evaluate(3));
        assertEquals("Fizz", fizzbuzz.evaluate(6));
    }

    @Test
    public void multiplesOfFiveReturnBuzz() {
        assertEquals("Buzz", fizzbuzz.evaluate(5));
        assertEquals("Buzz", fizzbuzz.evaluate(10));
    }

    @Test
    public void multipleOfSevenReturnsBang() {
        assertEquals("Bang", fizzbuzz.evaluate(7));
        assertEquals("Bang", fizzbuzz.evaluate(14));
    }

    @Test
    public void multiplesOfFifteenReturnsFizzBuzz() {
        assertEquals("FizzBuzz", fizzbuzz.evaluate(15));
        assertEquals("FizzBuzz", fizzbuzz.evaluate(30));
    }

    @Test
    public void multipleOfThreeFiveSevenReturnsFizzBuzzBang() {
        assertEquals(fizzbuzz.evaluate(105), "FizzBuzzBang");
    }

}
