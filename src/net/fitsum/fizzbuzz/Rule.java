package net.fitsum.fizzbuzz;

/**
 * Created by fitsumteklehaimanot on 12/04/15.
 */
public class Rule {
    private final int divisor;
    private final String value;


    public Rule(int divisor, String value) {
        this.divisor = divisor;
        this.value = value;
    }

    public String say (int number) {
        return number % divisor == 0 ? value : "";
    }
}
