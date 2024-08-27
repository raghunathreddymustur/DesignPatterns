package com.company.interpreter;



import java.util.Stack;

class Calculator {
    public static Expression parse(String expression) {
        Stack<Expression> stack = new Stack<>();
        Stack<String> operatorStack = new Stack<>();

        String[] tokens = tokenize(expression);
        for (String token : tokens) {
            if (isOperator(token)) {
                while (!operatorStack.isEmpty() && precedence(token) <= precedence(operatorStack.peek())) {
                    Expression rightExpression = stack.pop();
                    Expression leftExpression = stack.pop();
                    String operator = operatorStack.pop();
                    stack.push(getOperatorInstance(operator, leftExpression, rightExpression));
                }
                operatorStack.push(token);
            } else if (token.equals("(")) {
                operatorStack.push(token);
            } else if (token.equals(")")) {
                while (!operatorStack.peek().equals("(")) {
                    Expression rightExpression = stack.pop();
                    Expression leftExpression = stack.pop();
                    String operator = operatorStack.pop();
                    stack.push(getOperatorInstance(operator, leftExpression, rightExpression));
                }
                operatorStack.pop(); // Remove the "(" from the stack
            } else {
                stack.push(new NumberExpression(Integer.parseInt(token)));
            }
        }

        while (!operatorStack.isEmpty()) {
            Expression rightExpression = stack.pop();
            Expression leftExpression = stack.pop();
            String operator = operatorStack.pop();
            stack.push(getOperatorInstance(operator, leftExpression, rightExpression));
        }

        return stack.pop();
    }

    private static String[] tokenize(String expression) {
        // Simple tokenizer that handles spaces, numbers, operators, and parentheses
        return expression.split("(?<=[-+*/()])|(?=[-+*/()])");
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int precedence(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            default:
                return 0;
        }
    }

    private static Expression getOperatorInstance(String operator, Expression left, Expression right) {
        switch (operator) {
            case "+":
                return new AdditionExpression(left, right);
            case "-":
                return new SubtractionExpression(left, right);
            case "*":
                return new MultiplicationExpression(left, right);
            case "/":
                return new DivisionExpression(left, right);
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }
}

