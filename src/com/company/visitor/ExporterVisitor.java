package com.company.visitor;

public class ExporterVisitor implements DocumentVisitor {
    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("Exporting paragraph: <p>" + paragraph.getText() + "</p>");
    }

    @Override
    public void visit(Image image) {
        System.out.println("Exporting image: <img src=\"" + image.getImagePath() + "\"/>");
    }

    @Override
    public void visit(Table table) {
        System.out.println("Exporting table:");
        System.out.println("<table>");
        for (String[] row : table.getData()) {
            System.out.println("<tr>");
            for (String cell : row) {
                System.out.println("<td>" + cell + "</td>");
            }
            System.out.println("</tr>");
        }
        System.out.println("</table>");
    }
}

