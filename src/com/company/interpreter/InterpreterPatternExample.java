package com.company.interpreter;

public class InterpreterPatternExample {
    public static void main(String[] args) {
        // Example: ((9-5)-(5 + 3)) * (8 - 2) should evaluate to -24
        String expression = "((9-5)-(5+3))*(8-2)";

        Expression result = Calculator.parse(expression);
        int output = result.interpret();

        System.out.println("Result: " + output); // Output should be 48
    }
}
