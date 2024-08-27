package com.company.interpreter;

class MultiplicationExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public MultiplicationExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() * rightExpression.interpret();
    }
}
