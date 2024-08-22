package com.company.command;

// Client: Main Application
public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CommandManager commandManager = new CommandManager();

        // Adding "Hello"
        Command addHello = new AddTextCommand(editor, "Hello");
        commandManager.executeCommand(addHello);

        // Adding " World"
        Command addWorld = new AddTextCommand(editor, " World");
        commandManager.executeCommand(addWorld);

        // Undo last command (" World")
        commandManager.undo();

        // Redo last undone command (" World")
        commandManager.redo();

        // Adding "!!!"
        Command addExclamations = new AddTextCommand(editor, "!!!");
        commandManager.executeCommand(addExclamations);

        // Undo "!!!"
        commandManager.undo();
    }
}

