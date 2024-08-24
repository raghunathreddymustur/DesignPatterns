package com.company.visitor;

public interface DocumentElement {
    void accept(DocumentVisitor visitor);
}
