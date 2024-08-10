package com.company.prototype;

import java.util.HashMap;
import java.util.Map;

class NotebookRegistry {
    private Map<String, Notebook> notebookMap = new HashMap<>();

    // Add a notebook prototype to the registry
    public void addPrototype(String key, Notebook notebook) {
        notebookMap.put(key, notebook);
    }

    // Get a cloned notebook from the registry
    public Notebook getPrototype(String key) throws CloneNotSupportedException {
        Notebook notebook = notebookMap.get(key);
        return (Notebook) notebook.clone();
    }
}

