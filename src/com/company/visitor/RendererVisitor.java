package com.company.visitor;

public class RendererVisitor implements DocumentVisitor {
    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("Rendering paragraph: " + paragraph.getText());
    }

    @Override
    public void visit(Image image) {
        System.out.println("Rendering image from path: " + image.getImagePath());
    }

    @Override
    public void visit(Table table) {
        System.out.println("Rendering table:");
        for (String[] row : table.getData()) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}

