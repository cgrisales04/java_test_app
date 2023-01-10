package org.example.FizzBuzz;

public class FizzBuzz {
    public String isDivisible(int divisor) {
        String result = "";

        if (divisor % 3 == 0) result += "Fizz";
        if (divisor % 5 == 0) result += "Buzz";

        return result.isEmpty() ? String.valueOf(divisor) : result;
    }
}
