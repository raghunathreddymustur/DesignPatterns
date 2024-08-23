package com.company.mediator;

public class RegistrationDialog {
    public static void main(String[] args) {
        TextField nameField = new TextField();
        TextField emailField = new TextField();
        TextField passwordField = new TextField();
        Checkbox termsCheckbox = new Checkbox();
        Button submitButton = new Button();
        Button resetButton = new Button();
        Label errorMessageLabel = new Label();

        RegistrationDialogMediator mediator = new RegistrationDialogMediator();
        mediator.registerComponents(nameField, emailField, passwordField, termsCheckbox, submitButton, resetButton, errorMessageLabel);

        // Set the mediator for each component
        nameField.setMediator(mediator);
        emailField.setMediator(mediator);
        passwordField.setMediator(mediator);
        termsCheckbox.setMediator(mediator);
        submitButton.setMediator(mediator);
        resetButton.setMediator(mediator);
        errorMessageLabel.setMediator(mediator);

        // Simulate user interactions
        nameField.setText("John Doe");
        emailField.setText("john@example.com");
        passwordField.setText("password123");
        termsCheckbox.setChecked(true);

        submitButton.click(); // Form submitted successfully

        resetButton.click(); // Form is reset
    }
}

