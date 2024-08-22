package com.company.command;

// Receiver: TextEditor
public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void appendText(String newText) {
        text.append(newText);
        System.out.println("Current Text: " + text.toString());
    }

    public void removeText(int length) {
        int start = text.length() - length;
        if (start >= 0 && start < text.length()) {
            text.delete(start, start + length);
        }
        System.out.println("Current Text: " + text.toString());
    }

    public String getText() {
        return text.toString();
    }
}

