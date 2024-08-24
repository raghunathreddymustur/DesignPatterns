package com.company.visitor;

public class SpellCheckerVisitor implements DocumentVisitor {
    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("Checking spelling in paragraph: " + paragraph.getText());
        // Spell-check logic here
    }

    @Override
    public void visit(Image image) {
        // No spell-checking for images
    }

    @Override
    public void visit(Table table) {
        System.out.println("Checking spelling in table:");
        for (String[] row : table.getData()) {
            for (String cell : row) {
                System.out.println("Checking cell: " + cell);
                // Spell-check logic here
            }
        }
    }
}

