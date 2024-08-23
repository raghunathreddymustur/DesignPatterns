package com.company.mediator;

class TextField extends Component {
    private String text = "";

    public void setText(String text) {
        this.text = text;
        changed("textChanged");
    }

    public String getText() {
        return text.isEmpty() ? "" : text;
    }
}
