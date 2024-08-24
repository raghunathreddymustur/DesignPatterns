package com.company.visitor;

public class Table implements DocumentElement {
    private String[][] data;

    public Table(String[][] data) {
        this.data = data;
    }

    public String[][] getData() {
        return data;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}

