package com.company.visitor;

public class DocumentProcessingClient {
    public static void main(String[] args) {
        Document document = new Document();

        document.addElement(new Paragraph("This is a paragraph."));
        document.addElement(new Image("image.png"));
        document.addElement(new Table(new String[][]{
                {"Header1", "Header2"},
                {"Data1", "Data2"}
        }));

        // Apply Renderer Visitor
        RendererVisitor renderer = new RendererVisitor();
        document.applyVisitor(renderer);

        // Apply Spell Checker Visitor
        SpellCheckerVisitor spellChecker = new SpellCheckerVisitor();
        document.applyVisitor(spellChecker);

        // Apply Exporter Visitor
        ExporterVisitor exporter = new ExporterVisitor();
        document.applyVisitor(exporter);
    }
}

