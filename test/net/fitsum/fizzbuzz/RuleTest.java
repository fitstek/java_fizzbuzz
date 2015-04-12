package net.fitsum.fizzbuzz;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by fitsumteklehaimanot on 12/04/15.
 */
public class RuleTest {
    Rule rule = new Rule(3, "Fizz");
    @Test
    public void ifItIsDivisibleByDivisorItWillReturnTheValue() {

        assertEquals(rule.say(3), "Fizz");
        assertEquals(rule.say(6), "Fizz");
        assertEquals(rule.say(9), "Fizz");
    }

    @Test
    public void ifItIsNotDivisibleShouldReturnEmptyString() {
        assertEquals(rule.say(1), "");
    }
}