package com.company.interpreter;

class DivisionExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public DivisionExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() / rightExpression.interpret();
    }
}
