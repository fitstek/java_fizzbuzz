package net.fitsum.fizzbuzz;

import java.util.List;

/**
 * Created by fitsumteklehaimanot on 04/04/15.
 */
public class FizzBuzz {

    private final List<Rule> rules;

    public FizzBuzz(List<Rule> rules) {

        this.rules = rules;
    }


    public String evaluate(int number) {
        String result = "";

        for (Rule rule : rules) {
            result += rule.say(number);
        }

        if (result.isEmpty())
            result += toString(number);

        return result;
    }

    private String toString(int number) {
        return String.valueOf(number);
    }

}
